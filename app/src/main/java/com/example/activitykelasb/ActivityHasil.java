package com.example.activitykelasb;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {
    TextView txEmail, txPassword;
    @Override
    protected void onPostCreate( Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variabel txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.tvPassword);

        //Menghubungkan variabel txEmail dengan componen TextView pada layout
        txPassword = findViewById(R.id.tvPassword);

         //mendeklarasikan variiabel bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString( "a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass =bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variable pass kedalam txPassword
        txPassword.setText(pass);



    }
}
