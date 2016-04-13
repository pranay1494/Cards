package com.example.root.designs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by root on 3/3/16.
 */
public class RecAdapter extends RecyclerView.Adapter<RecAdapter.CardzviewHolder> {
    @Override
    public CardzviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.cards_layout, parent, false);
        return new CardzviewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardzviewHolder holder, int position) {
        holder.img.setImageResource(R.drawable.img);
        holder.txt.setText("4.0");
        holder.txt2.setText("Pranay Bansal");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class CardzviewHolder extends RecyclerView.ViewHolder{
      protected ImageView img;
        TextView txt;
        TextView txt2;
        public CardzviewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imageView);
            txt = (TextView) itemView.findViewById(R.id.textView);
            txt2 = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
