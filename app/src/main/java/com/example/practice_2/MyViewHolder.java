package com.example.practice_2;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView titleView;
    public Button buttonPlay;

    public MyViewHolder(@NotNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        titleView = itemView.findViewById(R.id.title);
        buttonPlay = itemView.findViewById(R.id.buttonPlay);
    }
}
