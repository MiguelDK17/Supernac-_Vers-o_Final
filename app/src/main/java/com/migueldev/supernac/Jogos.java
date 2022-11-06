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

public class Jogos extends AppCompatActivity {
    CardView crdPS4,crdPS4MEGA,crdPS4SPIDER,crdFar,crdfifa,crdcontrol,crdmine,crdpay,crdsims,crdelden;
    TextView edtPS4,edtPS4MEGA,edtPS4SPIDER,edtTotal,edtFar,edtfifa,cedtcontrol,edtmine,edtpay,
            edtsims,edtelden;
    TextView tvescondido;
    String Total,TotalDefinitivo,quantidade_final;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho_jogos);
        getSupportActionBar().hide();
        crdPS4 = (CardView) findViewById(R.id.crdPS4);
        crdPS4MEGA = (CardView) findViewById(R.id.crdPS4MEGAPACK);
        crdPS4SPIDER = (CardView) findViewById(R.id.crdPS4SPIDERMAN);
        crdelden = (CardView) findViewById(R.id.crdElden);
        crdcontrol = (CardView) findViewById(R.id.crdControl);
        crdfifa = (CardView) findViewById(R.id.crdFIFA);
        crdmine = (CardView) findViewById(R.id.crdMinecraft);
        crdpay = (CardView) findViewById(R.id.crdPay);
        crdFar = (CardView) findViewById(R.id.crdFarCry);
        crdsims = (CardView) findViewById(R.id.crdSims);
        edtPS4 = (TextView) findViewById(R.id.edtPS4);
        edtPS4MEGA = (TextView) findViewById(R.id.edtPS4MEGAPACK);
        edtPS4SPIDER = (TextView) findViewById(R.id.edtPS4SPIDERMAN);
        edtelden = (TextView) findViewById(R.id.edtElden);
        cedtcontrol = (TextView) findViewById(R.id.edtControl);
        edtmine = (TextView) findViewById(R.id.edtMinecraft);
        edtfifa = (TextView) findViewById(R.id.edtFIFA);
        edtpay = (TextView) findViewById(R.id.edtPay);
        edtsims = (TextView) findViewById(R.id.edtSims);
        edtFar = (TextView) findViewById(R.id.edtFarCry);
        edtTotal = (EditText) findViewById(R.id.edtTotaljogos);

        tvescondido = (TextView) findViewById(R.id.tvescondido7);

        crdPS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4 = 2399;
                Double E = PS4;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent assolan = new Intent(getApplicationContext(), finalizando_compras.class);
                        assolan.putExtra("house",edtTotal.getText().toString());
                        startActivity(assolan);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 SLIM"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdPS4MEGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4MEGA = 2999;
                Double E = PS4MEGA;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos= new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4MEGA));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4MEGA.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 MEGA PACK"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdPS4SPIDER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double PS4SPIDER = 2499;
                Double E = PS4SPIDER;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(PS4SPIDER));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtPS4SPIDER.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" PS4 SPIDER-MAN"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdelden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double elden = 219.99;
                Double E = elden;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(elden));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtelden.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" Elden Ring"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdfifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fifa = 129.99;
                Double E = fifa;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(fifa));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtfifa.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" FIFA"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdsims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sims = 119.99;
                Double E = sims;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(sims));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtsims.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" The Sims"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pay = 60.79;
                Double E = pay;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(pay));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtpay.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" Pay Day"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mine = 119.99;
                Double E = mine;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(mine));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtmine.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" Minecraft"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double far = 129.99;
                Double E = far;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(far));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = edtFar.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+"Far Cry"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });
        crdcontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cont = 110.99;
                Double E = cont;

                tvescondido.setText(E.toString());
                tvescondido.setText(Total);
                AlertDialog.Builder dialogo_dos_jogos = new
                        AlertDialog.Builder(Jogos.this);
                dialogo_dos_jogos.setTitle("CARRINHO");
                dialogo_dos_jogos.setMessage(" Quanto deste item você quer ?   " +String.valueOf(cont));
                final EditText quantidade = new EditText(Jogos.this);
                quantidade.setInputType(InputType.TYPE_CLASS_PHONE);
                dialogo_dos_jogos.setView(quantidade);
                dialogo_dos_jogos.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        quantidade_final=quantidade.getText().toString();
                        String A = quantidade_final.trim();
                        String B = cedtcontrol.getText().toString().trim();

                        Double C = Double.parseDouble(A);
                        Double D = Double.parseDouble(B);

                        Double E = (C*D);
                        edtTotal.setText(E.toString());
                        TotalDefinitivo = edtTotal.getText().toString();
                        Intent pano = new Intent(getApplicationContext(),finalizando_compras.class);
                        pano.putExtra("house",edtTotal.getText().toString());
                        startActivity(pano);

                        Toast.makeText(Jogos.this,"Foi Adicionado  "+quantidade_final+" Control"+" Ao carrinho",Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_dos_jogos.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialogo_dos_jogos.setCancelable(false);
                dialogo_dos_jogos.show();
            }
        });

    }
}