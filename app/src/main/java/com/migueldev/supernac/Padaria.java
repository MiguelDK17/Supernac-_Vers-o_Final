package com.migueldev.supernac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Padaria extends AppCompatActivity {
    TextView edtPaoAlho,edtPaoCoco,edtBolo,edtCiabatta,edtbandeja,edttorta,edtlimão,edtpais,edtpresunto,edtpesto;
    CardView btPAoAlho,btPaoCoco,btBolo,btCiabatta,btbandeja,bttorta,btlimão,btpais,btpresunto,btpesto;
    TextView tvescondido,edtTotal;
    String Total,TotalDefinitivo,quantidade_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padaria);
        getSupportActionBar().hide();
        btPAoAlho = (CardView) findViewById(R.id.crdPaoAlho);
        btPaoCoco = (CardView) findViewById(R.id.crdPaoCoco);
        btBolo = (CardView) findViewById(R.id.crdBolo);
        btCiabatta = (CardView) findViewById(R.id.crdCiabatta);
        btbandeja = (CardView) findViewById(R.id.crdbandeja);
        bttorta = (CardView) findViewById(R.id.crdTorta);
        btlimão = (CardView) findViewById(R.id.crdLimao);
        btpais = (CardView) findViewById(R.id.crdPais);
        btpresunto = (CardView) findViewById(R.id.crdPresunto);
        btpesto = (CardView) findViewById(R.id.crdPesto);

        edtPaoAlho = (TextView) findViewById(R.id.edtPaoAlho);
        edtPaoCoco = (TextView) findViewById(R.id.edtPaoCoco);
        edtBolo = (TextView) findViewById(R.id.edtBolo);
        edtCiabatta = (TextView) findViewById(R.id.edtCiabatta);
        edtbandeja = (TextView) findViewById(R.id.edtbandejapaes);
        edttorta = (TextView) findViewById(R.id.edtTorta);
        edtlimão = (TextView) findViewById(R.id.edtLimao);
        edtpais = (TextView) findViewById(R.id.edtPais);
        edtpresunto = (TextView) findViewById(R.id.edtPresunto);
        edtpesto = (TextView) findViewById(R.id.edtPesto);


        edtTotal = (TextView) findViewById(R.id.edttotalpadaria);
        tvescondido = (TextView) findViewById(R.id.tvescondido5);

        btPAoAlho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pao_alho = 2.99;
                Double E = pao_alho;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(pao_alho));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { ;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPaoAlho.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pao = new Intent(getApplicationContext(), finalizando_compras.class);
                        pao.putExtra("house",edtTotal.getText().toString());
                        startActivity(pao);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+quantidade_final+" Pão/es de Alho"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btPaoCoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pao_coco = 6.99;
                Double E = pao_coco;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(pao_coco));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPaoCoco.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent coco = new Intent(getApplicationContext(),finalizando_compras.class);
                        coco.putExtra("house",edtTotal.getText().toString());
                        startActivity(coco);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Pão/es de Coco"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bolo = 3.89;
                Double E = bolo;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(bolo));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtBolo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Bolo/s de Cenoura"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btCiabatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cia = 17.35;
                Double E = cia;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(cia));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCiabatta.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Ciabatta/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btbandeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bandeja = 319.90;
                Double E = bandeja;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(bandeja));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtbandeja.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Bandeja/s de Frios Pães e Vinho"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        bttorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double torta = 159.90;
                Double E = torta;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(torta));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edttorta.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Torta/s de Aniversário"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btlimão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double limão = 42.90;
                Double E = limão;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(limão));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtlimão.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Torta/s de Limão"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btpais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double band = 319.99;
                Double E = band;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(band));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtpais.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Bandeja/s ddo Dia dos Pais"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btpresunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double presunto = 3.99;
                Double E = presunto;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(presunto));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtpresunto.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Presunto/s"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
        btpesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pesto = 19.99;
                Double E = pesto;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_da_padaria = new
                        AlertDialog.Builder(Padaria.this);
                dialogo_da_padaria.setTitle("CARRINHO");
                dialogo_da_padaria.setMessage(" Quanto deste item você quer ?   " +String.valueOf(pesto));
                final EditText quantidade = new EditText(Padaria.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_da_padaria.setView(quantidade);
                dialogo_da_padaria.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtpesto.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent bolo = new Intent(getApplicationContext(),finalizando_compras.class);
                        bolo.putExtra("house",edtTotal.getText().toString());
                        startActivity(bolo);

                        Toast.makeText(Padaria.this,"Foi Adicionado  "+ quantidade_final +" Pãe/s Pesto com Nozes"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_da_padaria.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_da_padaria.setCancelable(false);
                dialogo_da_padaria.show();
            }
        });
    }
}