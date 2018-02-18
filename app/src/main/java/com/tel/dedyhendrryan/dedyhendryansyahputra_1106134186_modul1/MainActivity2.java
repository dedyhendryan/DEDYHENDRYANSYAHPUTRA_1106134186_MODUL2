package com.tel.dedyhendrryan.dedyhendryansyahputra_1106134186_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity{
    TextView namamakanan, porsi, nmarumahmakan, totalhrga;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denganmilea);
        namamakanan =(TextView) findViewById(R.id.nasiuduk);
        porsi =(TextView) findViewById(R.id.porsi2);
        totalhrga=(TextView) findViewById(R.id.harga1);
        nmarumahmakan=(TextView) findViewById(R.id.eatbus1);

        Intent c = getIntent();
        String rumahmakan =c.getStringExtra("nama_rumahmakan");
        String makanan = c.getStringExtra("nama_makanan");
        String porsimakanan =c.getStringExtra("porsi");
        int z = c.getIntExtra("total_harga" ,0);
        String totalhargaString = String.valueOf(z);



            namamakanan.setText(makanan);
            porsi.setText(porsimakanan);
            nmarumahmakan.setText(rumahmakan);
            totalhrga.setText(totalhargaString);


    }
}
