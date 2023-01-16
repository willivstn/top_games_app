package com.willi_vstn.top_games_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    //1 Data
    private Context context;
    private ArrayList<GameModel> gamesList;

    //2 Constructor

    public MyAdapter(Context context, ArrayList<GameModel> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }


    //3 View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gameImg = itemView.findViewById(R.id.cardView_image);
            gameTitle = itemView.findViewById(R.id.textview_card);
        }



    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GameModel model = gamesList.get(position);
        holder.gameTitle.setText(model.getGameName());
        holder.gameImg.setImageResource(model.getGameImg());


    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

}
