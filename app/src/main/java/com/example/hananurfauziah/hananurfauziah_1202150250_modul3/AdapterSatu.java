package com.example.hananurfauziah.hananurfauziah_1202150250_modul3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterSatu extends RecyclerView.Adapter<AdapterSatu.MainViewHolder>{
    private ArrayList<Satu> mMainData;
    private Context mContext;
    private GradientDrawable mGradientDrawable;

    AdapterSatu (Context context, ArrayList<Satu> MainData){
        this.mMainData = MainData;
        this.mContext = context;

        mGradientDrawable = new GradientDrawable(); // merupakan objek baru GradientDrwable
        mGradientDrawable.setColor(Color.GRAY); // untuk mengset warna abu - abu pada objek GradientDrawable
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(mContext, LayoutInflater.from(mContext).inflate(R.layout.activity_main2, parent, false), mGradientDrawable);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        Satu currentMain = mMainData.get(position);
        holder.bindTo(currentMain);
    }

    @Override
    public int getItemCount() {
        return mMainData.size(); // untuk mendapatkan ukuran item
    }

    public class MainViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView mMainImage;
        private Satu mCurrentMain;
        private Context mContext;
        private GradientDrawable mGradientDrawable;

        MainViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
            super(itemView);

            mTitleText = (TextView)itemView.findViewById(R.id.title); // sebagai referensi dari TextView
            mInfoText = (TextView)itemView.findViewById(R.id.newsTitle); // sebagai referensi dari TextView
            mMainImage = (ImageView)itemView.findViewById(R.id.mainImage); //sebagai referensi dari ImageView

            mContext = context ;
            mGradientDrawable = gradientDrawable;
            itemView.setOnClickListener(this);
        }

        public void bindTo(Satu currentMain) {
            mTitleText.setText((currentMain.getTitle())); // untuk setting Text dari method getTitle
            mInfoText.setText(currentMain.getInfo());// untuk setting text yang berisi info dari method getInfo
            mCurrentMain = currentMain;

            Glide.with(mContext).load(currentMain.getImageResource()).placeholder(mGradientDrawable).into(mMainImage);
        }

        @Override
        public void onClick(View view) {
            Intent detailIntent = Satu.starter(mContext, mCurrentMain.getTitle(),mCurrentMain.getImageResource());
            mContext.startActivity(detailIntent);
        }
    }
}
