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

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public Adapter(Context ct, String[] s1, String[] s2, int[] img){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.my_row1,parent,false);
        return new Adapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(data1[position]);
        holder.textView2.setText(data2[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView1 , textView2;
        ImageView imageView;

        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            int position = getAdapterPosition();
//            Toast.makeText(view.getContext(), "position"+position, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(),PrintandgiftActivity.class);
            view.getContext().startActivity(intent);

        }
    }
}
