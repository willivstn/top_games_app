package com.willi_vstn.top_games_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1 data
    ArrayList<GameModel> gamesList;

    //2 Adapter View
    RecyclerView recyclerView;

    //3 Adapter
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        gamesList = new ArrayList<>();
        gamesList.add(new GameModel("Elden Ring", R.drawable.eldenring));
        gamesList.add(new GameModel("God of War Ragnarok", R.drawable.godofwar));
        gamesList.add(new GameModel("Horizon Forbidden West", R.drawable.horizon));
        gamesList.add(new GameModel("Marvel Snap", R.drawable.marvel));
        gamesList.add(new GameModel("Stray", R.drawable.stray));
        gamesList.add(new GameModel("Tunic", R.drawable.tunic));

        adapter = new MyAdapter(this, gamesList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}