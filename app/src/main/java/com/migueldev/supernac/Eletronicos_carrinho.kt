package com.migueldev.supernac

import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.widget.TextView
import android.os.Bundle
import com.migueldev.supernac.R
import android.widget.EditText
import android.content.DialogInterface
import android.content.Intent
import android.text.InputType
import android.view.View
import com.migueldev.supernac.finalizando_compras
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class eletronicos_carrinho() : AppCompatActivity() {
    var crdMultimetro: CardView? = null
    var crdCapacitor: CardView? = null
    var crdChuveiro: CardView? = null
    var edtMultimetro: TextView? = null
    var edtCapacitor: TextView? = null
    var edtChuveiro: TextView? = null
    var tvescondido: TextView? = null
    var edtTotal: TextView? = null
    var TotalDefinitivo: String? = null
    var quantidade_final: String? = null
    var Total: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eletronicos_carrinho)
        supportActionBar!!.hide()
        crdMultimetro = findViewById<View>(R.id.crdMultimetro) as CardView
        crdCapacitor = findViewById<View>(R.id.crdCapacitor) as CardView
        crdChuveiro = findViewById<View>(R.id.crdChuveiro) as CardView
        edtMultimetro = findViewById<View>(R.id.edtMultimetro) as TextView
        edtCapacitor = findViewById<View>(R.id.edtCapacitor) as TextView
        edtChuveiro = findViewById<View>(R.id.edtChuveiro) as TextView
        edtTotal = findViewById<View>(R.id.edtTotaleletronicos) as TextView
        tvescondido = findViewById<View>(R.id.tvescondido6) as TextView
        crdMultimetro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val multimetro = 37.97
                val E = multimetro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $multimetro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    DialogInterface.OnClickListener { dialog, which ->
                        quantidade_final = quantidade.text.toString()
                        val A = quantidade_final!!.trim { it <= ' ' }
                        val B = edtMultimetro!!.text.toString().trim { it <= ' ' }
                        val C = A.toDouble()
                        val D = B.toDouble()
                        val E = (C * D)
                        edtTotal!!.text = E.toString()
                        TotalDefinitivo = edtTotal!!.text.toString()
                        val assolan = Intent(applicationContext, finalizando_compras::class.java)
                        assolan.putExtra("house", edtTotal!!.text.toString())
                        startActivity(assolan)
                        Toast.makeText(
                            this@eletronicos_carrinho,
                            "Foi Adicionado  $quantidade_final Multímetro/s Ao carrinho",
                            Toast.LENGTH_LONG
                        ).show()
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdCapacitor!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val capacitor = 0.20
                val E = capacitor
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $capacitor")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtCapacitor!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Capacitor/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
        crdChuveiro!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val chuveiro = 59.99
                val E = chuveiro
                tvescondido!!.text = E.toString()
                tvescondido!!.text = Total
                val dialogo_dos_eletronicos = AlertDialog.Builder(this@eletronicos_carrinho)
                dialogo_dos_eletronicos.setTitle("CARRINHO")
                dialogo_dos_eletronicos.setMessage(" Quanto deste item você quer ?   $chuveiro")
                val quantidade = EditText(this@eletronicos_carrinho)
                quantidade.inputType = InputType.TYPE_CLASS_PHONE
                dialogo_dos_eletronicos.setView(quantidade)
                dialogo_dos_eletronicos.setPositiveButton(
                    "ok",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            quantidade_final = quantidade.text.toString()
                            val A = quantidade_final!!.trim { it <= ' ' }
                            val B = edtChuveiro!!.text.toString().trim { it <= ' ' }
                            val C = A.toDouble()
                            val D = B.toDouble()
                            val E = (C * D)
                            edtTotal!!.text = E.toString()
                            TotalDefinitivo = edtTotal!!.text.toString()
                            val pano = Intent(applicationContext, finalizando_compras::class.java)
                            pano.putExtra("house", edtTotal!!.text.toString())
                            startActivity(pano)
                            Toast.makeText(
                                this@eletronicos_carrinho,
                                "Foi Adicionado  $quantidade_final Ducha Lorenzetti/s Ao carrinho",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                dialogo_dos_eletronicos.setNegativeButton(
                    "SAIR",
                    object : DialogInterface.OnClickListener {
                        override fun onClick(dialog: DialogInterface, which: Int) {
                            dialog.cancel()
                        }
                    })
                dialogo_dos_eletronicos.setCancelable(false)
                dialogo_dos_eletronicos.show()
            }
        })
    }
}