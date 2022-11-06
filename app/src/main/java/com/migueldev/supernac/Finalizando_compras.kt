package com.migueldev.supernac



import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.Toast
import com.migueldev.supernac.databinding.ActivityFinalizandoComprasBinding

class finalizando_compras : AppCompatActivity() {
    private lateinit var binding: ActivityFinalizandoComprasBinding
    private val ARQUIVO_PREFERÊNCIA: String = "ArquivoPreferência"
    var btCalcular: Button? = null
    var TotalCarrinhoFinalizado: String? = null
    var Total: String? = null
    var Total2: String? = null
    var resultado: String? = null
    var valor2: String? = null
    var valor1: String? = null
    var preco: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //tvRecebe!!.requestFocus()
        binding = ActivityFinalizandoComprasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.tvRecebe
        binding.tvInformacao
        binding.tvObrigado
        binding.txtValorBrinde
        binding.btSalvar
        binding.btLimpar
        binding.btCalcularCompra
        var valor: String? = "0"
        valor = intent.getStringExtra("house")
        val eletro = intent.getStringExtra("house")
        val alimentos = intent.getStringExtra("house")
        val casa = intent.getStringExtra("house")
        val informatica = intent.getStringExtra("house")
        val assolan = intent.getStringExtra("house")
        val padrão = intent.getStringExtra("house")
        binding.tvRecebe.text = informatica
        binding.tvRecebe.text = valor
        binding.tvRecebe.text = eletro
        binding.tvRecebe.text = alimentos
        binding.tvRecebe.text = casa
        binding.tvRecebe.text = assolan
        binding.tvRecebe.text = padrão




        //Comando para colocar R$ no valor pago pelo cliente
        /*SimpleMaskFormatter smf = new SimpleMaskFormatter("R$NNNN.NN ");
        MaskTextWatcher mtw = new MaskTextWatcher(edtValorPago, smf);
        edtValorPago.addTextChangedListener(mtw);*/

        //Fim da Máscara
        binding.btSalvar.setOnClickListener {

            val prefsatt = getSharedPreferences(ARQUIVO_PREFERÊNCIA, MODE_PRIVATE)
            val editor = prefsatt.edit()

            if (valor.isNullOrEmpty()){
                valor = "0"
            }
            //Validar o Preço
            if (binding.tvRecebe.text.toString().equals(""))
            {
                Toast.makeText(applicationContext,"Preencha o Preço",Toast.LENGTH_SHORT).show()
            }else {
                val nome:String = binding.tvRecebe.text.toString()
                editor.putString("nome",nome)
                editor.commit()
                binding.tvRecebe.text = nome
            }
        }
        val prefsatt = getSharedPreferences(ARQUIVO_PREFERÊNCIA, MODE_PRIVATE)
        val total: String?

        if (prefsatt.contains("nome")) {
            val nome: String? =
                prefsatt.getString("nome", "Hmm que estranho, ainda não tem nada aqui :(")

            if (binding.tvRecebe.text.toString().equals("")) {
                binding.tvRecebe.text = nome
            }
            else {
                var nome_if: Double = nome!!.toDouble()
                var valor_Double: Double = valor!!.toDouble()
                total = (valor_Double + nome_if).toString()
                binding.tvRecebe.text = total.toString()
            }
        }
        //Fazer um botão extra pra levar pra outra tela

        /*Intent save = new Intent(finalizando_compras.this,categoria.class);
            startActivity(save);*/

        binding.btLimpar.setOnClickListener {
            val elimina = getSharedPreferences(ARQUIVO_PREFERÊNCIA, MODE_PRIVATE)
            val editor = elimina.edit().clear()
            editor.commit()
            binding.tvRecebe.text =  ""

        }

    }
    fun finalizarCompra(v: View?) {
        val ValorCompra = binding.tvRecebe.text.toString().toDouble()
        val ValorPago = binding.edtValorPago.text.toString().toDouble()
        val ValorTroco = ValorPago - ValorCompra


        //Comando pra duas casas decimais
        if (ValorCompra >= 100) {
            binding.txtValorBrinde.text = "SIM"
        } else {
            binding.txtValorBrinde.text = "NÃO"
        }
    }

    private fun alert(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}