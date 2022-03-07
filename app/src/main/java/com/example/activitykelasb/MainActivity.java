package com.example.activitykelasb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                //Menyimpan input user di edittext password kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //menegeset email yang benar
                String email = "admin@mail.com";

                // mengeset password yang benar */
                String pass = "123";

                //mengecek apakah edittext email dan password terdapat isi atau tidak
                if (nama.isEmpty() ||  password.isEmpty()) {
                    //membuat varieable toast dan menampilkan pesan "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi!!!",
                            Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }else {

                    //mengecek apakah isi dari email dan password sudah sama dengan email
                    //password yang sudah diset
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat variabel toastdan menampilkan pesan "login sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();

                        //Membuat objek bundle
                        Bundle b = new Bundle();

                        //memasukkan value dari variable nama dengan kunci "a"
                        //dan dimasukkan kedalam bundle
                        b.putString("a", nama.trim());

                        //memasukkan valued ari variabel password dengan kunci "b"
                        //dan dimasukkan kedalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        //memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }else{
                        //membuat variabel toast dan membuat toast dan menampilkan pesan "login gagal"

                        Toast t =Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);

                        //menampilkan toast
                        t.show();


                    }
                }
            }
        });
    }
}





