package com.migueldev.supernac.adapter

import android.content.ContentValues.TAG
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.migueldev.supernac.R
import com.migueldev.supernac.alimentos
import com.migueldev.supernac.model.Produtos

class AdapterProds(private var prods: ArrayList<Produtos>, var context: Context): RecyclerView.Adapter<AdapterProds.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.context
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produtos: Produtos = prods[position]
        this.context
        holder.nome.text = produtos.nome
        holder.preco.text = produtos.preco
        val nome: String = holder.nome.text.toString()
        val preco: String = holder.preco.text.toString()
        holder.btComprar.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val builder = AlertDialog.Builder(context)
                builder.apply {
                    setTitle(
                        "CARRINHO"
                    )
                    setMessage(
                        "Insira a quantidade"
                    )

                    //criação de variável e componente EditText
                    val quantidade = EditText(context)
                    //tipo do EditText EditText definido para apenas números
                    quantidade.inputType = InputType.TYPE_CLASS_NUMBER
                    // a View AlertDialog recebe o EditText
                    builder.setView(quantidade)

                    setPositiveButton(
                        "ok",
                        DialogInterface.OnClickListener { dialog, which ->

                            //variavel que irá conter a quantidade desejada
                            val quantidadeFinal = quantidade.text.toString()

                            //variavel que irá guardar o preço final calculado com base no preço base do produto mais a quantidade
                            val precoFinal: Float = preco.toFloat() * quantidadeFinal.toFloat()

                            Toast.makeText(
                                context.applicationContext,
                                "O produto $nome com o preço R$:$precoFinal foi enviado ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    )
                    setNegativeButton(
                        "CANCELAR",
                        object : DialogInterface.OnClickListener {
                            override fun onClick(p0: DialogInterface?, p1: Int) {
                                p0?.cancel()
                            }
                        }
                    )
                }
                val dialog: AlertDialog = builder.create()
                dialog.setCancelable(false)
                dialog.show()
            }
        })

    }

    override fun getItemCount(): Int {
        return prods.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nome =  itemView.findViewById<TextView>(R.id.nome)
        val preco =  itemView.findViewById<TextView>(R.id.preco)
        val btComprar = itemView.findViewById<Button>(R.id.comprar)

        fun OnBindView(prods: ArrayList<Produtos>) {
            val nome = itemView.findViewById<TextView>(R.id.none)
            val preco = itemView.findViewById<TextView>(R.id.preco)
        }
    }

}