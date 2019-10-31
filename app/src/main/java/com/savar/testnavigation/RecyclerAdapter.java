package com.savar.testnavigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        switch (position){

            case 0:
                holder.txtName.setText("PHP");
                break;
            case 1:
                holder.txtName.setText("JAVA");
                break;

            case 2:
                holder.txtName.setText("C");
                break;

            case 3:
                holder.txtName.setText("C++");
                break;

            case 4:
                holder.txtName.setText("KOTLIN");
                break;

            case 5:
                holder.txtName.setText("GO");
                break;
            case 6:
                holder.txtName.setText("C#");
                break;

            case 7:
                holder.txtName.setText("PHYTON");
                break;
        }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{


        TextView txtName;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
