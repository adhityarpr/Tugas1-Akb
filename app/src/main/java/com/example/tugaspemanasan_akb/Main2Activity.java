package com.example.tugaspemanasan_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView view = (TextView) findViewById(R.id.ketentuan);
        String formattedText = "<b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> Kami";
        // or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
        EditText et = findViewById(R.id.kod);
        et.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }



    public void Kode(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }
}
