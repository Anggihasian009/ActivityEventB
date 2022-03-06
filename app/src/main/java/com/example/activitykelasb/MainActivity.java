package com.example.activitykelasb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSign);

        //Menghubungkan variabel edmail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast s = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan password anda: " + password + "", Toast.LENGTH_LONG);

                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Sukses",Toast.LENGTH_LONG);

                Toast u = Toast.makeText(getApplicationContext(),
                        "Password Salah",Toast.LENGTH_LONG);

                Toast v = Toast.makeText(getApplicationContext(),
                        "Email Salah",Toast.LENGTH_LONG);

                Toast w = Toast.makeText(getApplicationContext(),
                        "Email dan Password salah",Toast.LENGTH_LONG);

                //menampilkan toast
                t.show();
                u.show();
                v.show();
                w.show();
            }
        });
    }
}





