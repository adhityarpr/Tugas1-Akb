package com.example.tugaspemanasan_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    String namae;
    private String keyn = "Nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void Selanjutnya(View view) {
        EditText masukan_nama = findViewById(R.id.nama);
        namae = masukan_nama.getText().toString();
        try{
            if(namae != null && namae != "" ){
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra(keyn, namae);
                startActivity(intent);
            } else {
                Toast.makeText(getApplication(), "Nama dan Umur Wajib di isi", Toast.LENGTH_SHORT);

            }

        } catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
        }
    }
}
