package com.tel.dedyhendrryan.dedyhendryansyahputra_1106134186_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget. Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edTextMenu;
    EditText edTextJumlah;
    Button btEatbus;
    Button btAbnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denganmilea);

        //deklarasi berdasarkan diatas
        edTextMenu = (EditText) findViewById(R.id.editTextMenu);
        edTextJumlah = (EditText) findViewById(R.id.editTextJumlah);
        btEatbus = (Button) findViewById(R.id.btEatbus);
        btAbnormal = (Button) findViewById(R.id.btAbnormal);

        btEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nasiuduk = edTextMenu.getText().toString();
                final String porsi2 = edTextJumlah.getText().toString();
                int jumlah_integer = Integer.parseInt(edTextJumlah.getText().toString());
                Intent olala = new Intent(getApplicationContext(), MainActivity2.class);
                olala.putExtra("nama_rumahmakan", "Eatbus");
                olala.putExtra("nama_makanan", nasiuduk);
                olala.putExtra("porsi", porsi2);
                olala.putExtra("total_harga", "jumlah_integer * 50000");
                startActivity(olala);

            }
        });


        btAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        {
            final String nasiuduk = edTextMenu.getText().toString();
            final String porsi2 = edTextJumlah.getText().toString();
            int jumlahinteger = Integer.parseInt(edTextJumlah.getText().toString());
            Intent ola = new Intent(getApplicationContext(), MainActivity2.class);
            ola.putExtra("nama_rumahmakan", "Eatbus");
            ola.putExtra("nama_makanan", nasiuduk);
            ola.putExtra("porsi", porsi2);
            ola.putExtra("total_harga", "jumlah_integer*30000");
            startActivity(ola);


        }
        };

    }


