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

public class alimentos extends AppCompatActivity {
    TextView edtTotal,edtDoritos,edtLinguiça,edtLombo,edtPão,
            edtBacon,edtFeijão,edtArroz,edtOvos,edtMacarrão,edtAçucar;
    TextView tvescondido;
    CardView btDoritos,btLinguça,btLombo,btPão,btBacon,btFeijão,btArroz,btOvos,btMacarrão,btAçucar;
    String Total,quantidade_final,TotalDefinitivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);
        getSupportActionBar().hide();
        btDoritos = (CardView) findViewById(R.id.crdDoritos);
        btLinguça = (CardView) findViewById(R.id.crdLinguiça);
        btLombo = (CardView) findViewById(R.id.crdLombo);
        btPão = (CardView) findViewById(R.id.crdLombolombo);
        btBacon = (CardView) findViewById(R.id.crdBacon);
        btFeijão = (CardView) findViewById(R.id.crdFeijao);
        btArroz = (CardView) findViewById(R.id.crdArroz);
        btOvos = (CardView) findViewById(R.id.crdOvo);
        btMacarrão = (CardView) findViewById(R.id.crdMacarrao);
        btAçucar = (CardView) findViewById(R.id.crdAcucar);
        edtDoritos = (TextView) findViewById(R.id.edtDoritos);
        edtLinguiça = (TextView) findViewById(R.id.edtLinguiça);
        edtLombo = (TextView) findViewById(R.id.edtLombo);
        edtPão = (TextView) findViewById(R.id.edtpaodecheese);
        edtBacon = (TextView) findViewById(R.id.edtbacon);
        edtFeijão = (TextView) findViewById(R.id.edtfejao);
        edtArroz = (TextView) findViewById(R.id.edtarroz);
        edtOvos = (TextView) findViewById(R.id.edtovo);
        edtMacarrão = (TextView) findViewById(R.id.edtMacarrao);
        edtAçucar = (TextView) findViewById(R.id.edtAcucar);
        edtTotal = (EditText) findViewById(R.id.edtTotalAlimentos);
        tvescondido = (TextView) findViewById(R.id.tvescondido3);


        /*chkdoritos = (CheckBox) findViewById(R.id.chkdoritos);
        chklinguiça = (CheckBox) findViewById(R.id.chklinguiça);
        chklombo = (CheckBox) findViewById(R.id.chklombo);
        btTotal = (Button) findViewById(R.id.btTotalalimentos);
        edtTotal = (EditText) findViewById(R.id.edttotalalimentos);
        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            //Não coloque ponto e vírgula nos 'ifs'
            public void onClick(View v) {
                double total = 0;
                if(chkdoritos.isChecked())
                    total +=4.85;
                if(chklinguiça.isChecked())
                    total +=19.99;
                if(chklombo.isChecked())
                    total +=23.99;
                Double E = total;
                edtTotal.setText(E.toString());
                Intent alimentos = new Intent(getApplicationContext(),finalizando_compras.class);
                alimentos.putExtra("house",edtTotal.getText().toString());
                startActivity(alimentos);
            }
        });
    */
        btDoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double doritos = 2.99;
                Double E = doritos;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " + "Preço do item "+String.valueOf(doritos));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtDoritos.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent doritos = new Intent(getApplicationContext(), finalizando_compras.class);
                        doritos.putExtra("house",edtTotal.getText().toString());
                        startActivity(doritos);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Doritos"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();

            }
        });
        btLinguça.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double linguiça = 19.99;
                Double E = linguiça;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(linguiça));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtLinguiça.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Linguiça"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btLombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lombo = 23.99;
                Double E = lombo;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(lombo));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtLombo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent lombo = new Intent(getApplicationContext(),finalizando_compras.class);
                        lombo.putExtra("house",edtTotal.getText().toString());
                        startActivity(lombo);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Lombo de Porco"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btPão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Pão = 32.00;
                Double E = Pão;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Pão));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPão.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Pão/es de Queijo"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Bacon = 18.80;
                Double E = Bacon;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Bacon));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtBacon.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Linguiça"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btFeijão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Feijão = 8.50;
                Double E = Feijão;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Feijão));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtFeijão.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" pacote/s de feijão Camil"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btArroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Arroz = 17.90;
                Double E = Arroz;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Arroz));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtArroz.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" Saco/s de Arroz Sepé"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btOvos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Ovos = 21.50;
                Double E = Ovos;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Ovos));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtOvos.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" pente de ovos brancos"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btMacarrão.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Macarrão = 5.99;
                Double E = Macarrão;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Macarrão));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtMacarrão.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" pacote/s de Macarrão Vilma"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
        btAçucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Açucar = 12.69;
                Double E = Açucar;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_alimentos = new
                        AlertDialog.Builder(alimentos.this);
                dialogo_dos_alimentos.setTitle("CARRINHO");
                dialogo_dos_alimentos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Açucar));
                final EditText quantidade = new EditText(alimentos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_alimentos.setView(quantidade);
                dialogo_dos_alimentos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtAçucar.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent linguiça = new Intent(getApplicationContext(),finalizando_compras.class);
                        linguiça.putExtra("house",edtTotal.getText().toString());
                        startActivity(linguiça);

                        Toast.makeText(alimentos.this,"Foi Adicionado  "+quantidade_final+" pacote/s de Açucar Delta"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_alimentos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_alimentos.setCancelable(false);
                dialogo_dos_alimentos.show();
            }
        });
    }
}