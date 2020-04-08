package com.example.tugaspemanasan_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {


    String keyn = "Nama";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle extra = getIntent().getExtras();

        String namae = extra.getString(keyn);
        text =findViewById(R.id.beres);
        text.setText("Beres! Sekarang " +namae+ " udah bisa ngecek penggunaan Hp " +namae+ " tiap hari buat bantu " +namae+ " ngatur waktu:)");
    }

    public void Oke(View view){
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
