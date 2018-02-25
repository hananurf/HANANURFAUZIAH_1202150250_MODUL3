package com.example.hananurfauziah.hananurfauziah_1202150250_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main1);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run () { // untuk pindah ke halaman selanjutnya
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                finish();
            }
        }, 2000L); //tandanya 2 detik untuk menunggu ke halaman selanjutnya
    }

}
