package com.migueldev.supernac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {
    CardView crdFacebook,crdTwitter, crdPerfil, crdVendas, crdOfertas;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);
        TextView tvRecebeusu;
        FloatingActionButton btcarrinhoflutuante;


        tvRecebeusu = (TextView) findViewById(R.id.tvRecebeUsuario1);
        FirebaseAuth auth = FirebaseAuth.getInstance();
        String usuario = auth.getCurrentUser().getDisplayName();
        tvRecebeusu.setText("Olá " + usuario + " !!!");
        crdVendas = (CardView) findViewById(R.id.crdVendas);
        crdOfertas = (CardView) findViewById(R.id.crdOfertas);
        crdFacebook = (CardView) findViewById(R.id.crdFacebook);
        /*crdPerfil = (CardView) findViewById(R.id.btPerfil);
        crdTwitter = (CardView) findViewById(R.id.btTwitter);*/


        crdVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity2.this, categoria.class);
                startActivity(it);
            }
        });
                crdFacebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent feeling = new Intent(getApplicationContext(), Facebook.class);
                        startActivity(feeling);
                    }
                });

                /*btTwitter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Road = new Intent(getApplicationContext(),Twitter.class);
                        startActivity(Road);
                    }
                });*/
            }
}
