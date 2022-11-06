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

public class bebidas extends AppCompatActivity {

    CardView crdAgua,crdCoca,crdKapo,crdGuaraná,crdTial,crdPepsi,crdSchweppes,crdCha
            ,crdH2O,crdFanta;
    TextView edtAgua,edtCoca,edtKapo,edtTotal,edtGuarana,edtTial,edtpepsi,edtSchweppes,
    edtCha,edth2o,edtfanta;
    TextView tvescondido;
    String TotalDefinitivo,quantidade_final,Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        getSupportActionBar().hide();
        crdAgua = (CardView) findViewById(R.id.crdAgua);
        crdCoca = (CardView) findViewById(R.id.crdCocaCola);
        crdKapo = (CardView) findViewById(R.id.crdDellValle);
        crdGuaraná = (CardView) findViewById(R.id.crdGuarana);
        crdTial = (CardView) findViewById(R.id.crdTial);
        crdCha = (CardView) findViewById(R.id.crdChaMate);
        crdPepsi = (CardView) findViewById(R.id.crdPepsi);
        crdSchweppes = (CardView) findViewById(R.id.crdSchweppes);
        crdH2O = (CardView) findViewById(R.id.crdH2O);
        crdFanta = (CardView) findViewById(R.id.crdFanta);


        edtAgua = (TextView) findViewById(R.id.edtAgua);
        edtCoca = (TextView) findViewById(R.id.edtCoca);
        edtKapo = (TextView) findViewById(R.id.edtKapo);
        edtCha = (TextView) findViewById(R.id.edtKapo);
        edtGuarana = (TextView) findViewById(R.id.edtKapo);
        edtTial = (TextView) findViewById(R.id.edtKapo);
        edtCha = (TextView) findViewById(R.id.edtKapo);
        edtpepsi = (TextView) findViewById(R.id.edtKapo);
        edtSchweppes = (TextView) findViewById(R.id.edtKapo);
        edth2o = (TextView) findViewById(R.id.edtKapo);
        edtTotal = (EditText) findViewById(R.id.edtTotalBebidas);
        tvescondido = (TextView) findViewById(R.id.tvescondido2);

        crdAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double agua = 2.99;
                Double E = agua;


                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(agua));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtAgua.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent agua = new Intent(getApplicationContext(), finalizando_compras.class);
                        agua.putExtra("house",edtTotal.getText().toString());
                        startActivity(agua);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+quantidade_final+" Água"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdCoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double coca = 7.99;
                Double E = coca;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(coca));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        double quantidade_calculo = 0;
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCoca.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent coca = new Intent(getApplicationContext(),finalizando_compras.class);
                        coca.putExtra("house",edtTotal.getText().toString());
                        startActivity(coca);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Coca Cola"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdKapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kapo = 6.99;
                Double E = kapo;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(kapo));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtKapo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Dell Valle Kapo"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdGuaraná.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Guaraná = 6.99;
                Double E = Guaraná;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(Guaraná));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtKapo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Garrafa/s de Guaraná"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdTial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tial = 4.99;
                Double E = tial;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(tial));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtTial.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Tial"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdFanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kapo = 6.99;
                Double E = kapo;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(kapo));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtKapo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Dell Valle Kapo"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdKapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kapo = 6.99;
                Double E = kapo;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(kapo));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtKapo.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Dell Valle Kapo"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdKapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fanta = 5.79;
                Double E = fanta;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(fanta));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtfanta.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Fanta"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdH2O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h20 = 4.79;
                Double E = h20;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(h20));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edth2o.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" H2O"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
        crdCha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cha = 2.50;
                Double E = cha;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_das_bebidas = new
                        AlertDialog.Builder(bebidas.this);
                dialogo_das_bebidas.setTitle("CARRINHO");
                dialogo_das_bebidas.setMessage(" Quanto deste item você quer ?   " +String.valueOf(cha));
                final EditText quantidade = new EditText(bebidas.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_das_bebidas.setView(quantidade);
                dialogo_das_bebidas.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtCha.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent kapo = new Intent(getApplicationContext(),finalizando_compras.class);
                        kapo.putExtra("house",edtTotal.getText().toString());
                        startActivity(kapo);

                        Toast.makeText(bebidas.this,"Foi Adicionado  "+ quantidade_final +" Chá Mate"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_das_bebidas.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_das_bebidas.setCancelable(false);
                dialogo_das_bebidas.show();
            }
        });
    }
}