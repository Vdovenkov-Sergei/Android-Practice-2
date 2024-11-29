package com.example.practice_2;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private final Context context;
    private final ArrayList<ItemData> items;

    MyAdapter(Context context, ArrayList<ItemData> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int idx) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int idx) {
        ItemData item = items.get(idx);
        holder.titleView.setText(item.getTitle());
        holder.imageView.setImageResource(item.getImage());
        holder.buttonPlay.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(context, item.getSound());
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
