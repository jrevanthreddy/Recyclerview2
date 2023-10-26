package com.example.myapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.example.myapp.model.Fashion;

import java.util.List;

public class MyCustonAdapter extends RecyclerView.Adapter<MyCustonAdapter.FashionViewHolder> {

    List<Fashion> fashionList;

    public MyCustonAdapter(List<Fashion> fashionList) {
        this.fashionList = fashionList;
    }

    @NonNull
    @Override
    public MyCustonAdapter.FashionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewitem= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        return new FashionViewHolder(viewitem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustonAdapter.FashionViewHolder holder, int position) {
        Fashion fashion=fashionList.get(position);

        holder.name.setText(fashion.getName());
        holder.imageButton.setImageResource(fashion.getFashionimage());

    }

    @Override
    public int getItemCount() {
        return fashionList.size();
    }

    public static class FashionViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageButton imageButton;
        public FashionViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            imageButton=itemView.findViewById(R.id.fashion_image);
        }
    }
}