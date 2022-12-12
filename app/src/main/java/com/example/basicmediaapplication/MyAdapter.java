package com.example.basicmediaapplication;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String[] s1, int[] img){
       context = ct;
       data1 = s1;
       images = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(data1[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView1;
        ImageView imageView;

        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(),LibraryActivity.class);
            view.getContext().startActivity(intent);

        }
    }


}
