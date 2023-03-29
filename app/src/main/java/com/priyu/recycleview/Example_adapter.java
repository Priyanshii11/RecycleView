package com.priyu.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Example_adapter extends RecyclerView.Adapter<Example_adapter.ExampleViewHolder> {
    private ArrayList<Example_item> mExamplelist;
    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public ExampleViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    public Example_adapter(ArrayList<Example_item> exampleList){
        mExamplelist=exampleList;
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_list,parent,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Example_item currentItem = mExamplelist.get(i);
        exampleViewHolder.imageView.setImageResource(currentItem.getmImageresources());
        exampleViewHolder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {
        return mExamplelist.size();
    }

}
