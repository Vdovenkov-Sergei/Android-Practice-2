package com.example.practice_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ArrayList<ItemData> items = new ArrayList<>();
        items.add(new ItemData("Bear - [beə(r)] - медведь", R.drawable.bear, R.raw.bear));
        items.add(new ItemData("Cat - [kæt] - кошка", R.drawable.cat, R.raw.cat));
        items.add(new ItemData("Cow - [kaʊ] - корова", R.drawable.cow, R.raw.cow));
        items.add(new ItemData("Dog - [dɒɡ] - собака", R.drawable.dog, R.raw.dog));
        items.add(new ItemData("Fish - [fɪʃ] - рыба", R.drawable.fish, R.raw.fish));
        items.add(new ItemData("Fox - [fɒks] - лиса", R.drawable.fox, R.raw.fox));
        items.add(new ItemData("Goat - [ɡəʊt] - коза", R.drawable.goat, R.raw.goat));
        items.add(new ItemData("Hamster - [ˈhæm.stər] - хомяк", R.drawable.hamster, R.raw.hamster));
        items.add(new ItemData("Horse - [hɔːs] - лошадь", R.drawable.horse, R.raw.horse));
        items.add(new ItemData("Mouse - [maʊs] - мышь", R.drawable.mouse, R.raw.mouse));
        items.add(new ItemData("Parrot - [ˈpærət] - попугай", R.drawable.parrot, R.raw.parrot));
        items.add(new ItemData("Rabbit - [ˈræbɪt] - кролик", R.drawable.rabbit, R.raw.rabbit));
        items.add(new ItemData("Raccoon - [rəˈkuːn] - енот", R.drawable.raccoon, R.raw.raccoon));
        items.add(new ItemData("Sheep - [ʃiːp] - овца", R.drawable.sheep, R.raw.sheep));
        items.add(new ItemData("Squirrel - [ˈskwɪrəl] - белка", R.drawable.squirrel, R.raw.squirrel));
        items.add(new ItemData("Wolf - [wʊlf] - волк", R.drawable.wolf, R.raw.wolf));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}