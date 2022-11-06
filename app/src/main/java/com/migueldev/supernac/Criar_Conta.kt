package com.migueldev.supernac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.migueldev.supernac.databinding.ActivityCriarContaBinding

class Criar_Conta : AppCompatActivity() {
    private lateinit var binding: ActivityCriarContaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarContaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btConfirmar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                if (binding.edtNome.text.equals("") && binding.edtSobrenome.text.equals("") && binding.edtEmail.text.equals("") && binding.edtSenha.text.equals("")){
                    Toast.makeText(
                        applicationContext, "Os campos precisam estar preenchidos", Toast.LENGTH_SHORT
                    ).show()
                }
                else {
                    criarConta()
                }
            }
        })
    }
    private fun criarConta(){
        val email: String = binding.edtEmail.text.toString()
        val password: String = binding.edtSenha.text.toString()
        var auth= FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                task ->
                if(task.isSuccessful){
                    val user = auth.currentUser
                    val profileUpdates = userProfileChangeRequest {
                        displayName = binding.edtNome.text.toString()
                    }
                    user!!.updateProfile(profileUpdates)
                        .addOnCompleteListener(this) {
                            task ->
                            if (task.isSuccessful){
                            val after = Intent (applicationContext, MainActivity2::class.java)
                            startActivity(after)
                                }
                            else {
                                Toast.makeText(
                                    applicationContext, "Falha ao enviar as informações do usuário", Toast.LENGTH_SHORT
                                ).show()
                            }
                        }


                }
                else {
                    Toast.makeText(applicationContext, "Falha na criação da conta", Toast.LENGTH_SHORT)
                        .show()
                }
            }

    }
}