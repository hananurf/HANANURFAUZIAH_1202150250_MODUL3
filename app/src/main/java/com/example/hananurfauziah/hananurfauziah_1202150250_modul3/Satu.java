package com.example.hananurfauziah.hananurfauziah_1202150250_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

class Satu { //anak dari MainAdapter

    private final String title;
    private final String info;
    private final int imageResource;

    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "Image Resource";

    Satu (String title, String info, int imageResource){
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
    String getTitle()  // method untuk menampilkan title
    {
        return title; // untuk menampilkan title
    }
    String getInfo() // method untuk menampilkan info
    {
        return info; // untuk menampilkan info
    }
    int getImageResource() // method untuk menampilkan gambar
    {
        return imageResource; // untuk menampilkan gambar
    }
    static Intent starter(Context context, String title, @DrawableRes int imageResId){
        Intent detailIntent = new Intent(context, Main5Activity.class); // untuk pindah ke halaman Main5Activity
        detailIntent.putExtra(TITLE_KEY, title); // untuk menampilkan title
        detailIntent.putExtra(IMAGE_KEY, imageResId); // untuk menampilkan gambar yang dipilih pada halaman Main5Activity
        return detailIntent;
    }
}
