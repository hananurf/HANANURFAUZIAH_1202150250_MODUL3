package com.example.hananurfauziah.hananurfauziah_1202150250_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username = (EditText) findViewById(R.id.editText); // merupakan referensi dari layout yang telah dibuat
        password = (EditText) findViewById(R.id.editText2); // merupakan referensi dari layout yang telah dibuat
        login = (Button) findViewById(R.id.button); // merupakan referensi dari layout yang telah dibuat
    }

    public void login(View view) { // method untuk membuat action ketika button di klik
        if (username.getText().toString().equals("EAD")&&password.getText().toString().equals("MOBILE")) { // mengset untuk username dan password
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show(); // pesan yang ditampilkan apabila username dan passwordnya benar
            Intent intentlogin = new Intent( Main2Activity.this, Main3Activity.class); // agar bisa pindah ke halaman selanjutnya
            startActivity(intentlogin);
        } else {
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show(); // pesan yang ditampilkan apabila username dan passwordnya salah
        }
    }
}