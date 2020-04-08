package com.example.tugaspemanasan_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*
NIM     : 10117134
Nama    : Adhitya Rizqy Pratama
Kelas   : IF4
Matkul  : Aplikasi Komputasi Bergerak
Tugas   : AKB-Tugas-1


 */
//    6 April 2020, 12.30 WIB : Selesai membuat halaman activity_main
//    6 April 2020, 14.45 WIB : Selesai Membuat halaman activity_main2
//    8 April 2020, 15.23 WIB : Selesai Membuat halaman activity_main3 dan activity_main4
//    Tugas sudah selesai
//    8 April 2020, Membuat apk rilis dan mengirim file ke email

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mulai(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
