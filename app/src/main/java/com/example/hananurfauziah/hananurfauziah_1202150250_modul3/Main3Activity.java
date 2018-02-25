package com.example.hananurfauziah.hananurfauziah_1202150250_modul3;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Satu> mMainData;
    private AdapterSatu mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView); // sebagai referensi recyclerview
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));// untuk mengsetting layout yang menampilkan kolom gambar

        mMainData = new ArrayList<>(); // meruupakan objek baru pada ArrayList

        mAdapter = new AdapterSatu (this, mMainData); // untuk membuat objek baru pada AdapterSatu
        mRecyclerView.setAdapter(mAdapter); // untuk mengset adapter
        initializeData(); // untuk memanggil method initializeData
    }
    private void initializeData (){
        String[] mainList = getResources().getStringArray(R.array.main_titles); // supaya bisa mendapat data dari array main_titles
        String[] mainInfo = getResources().getStringArray(R.array.main_info);// supaya bisa mendapat data dari array main_info
        TypedArray mainImageResource = getResources().obtainTypedArray(R.array.main_images); // supaya bisa mendapat gambar dari array main_images
        mMainData.clear(); // untuk menghapus data duplikat

        for(int i=0; i<mainList.length; i++){ // untuk membuat perulangan
            mMainData.add(new Satu(mainList[i], mainInfo[i],
                    mainImageResource.getResourceId(i,0)));
        }

        mainImageResource.recycle();
        mAdapter.notifyDataSetChanged();
    }
}