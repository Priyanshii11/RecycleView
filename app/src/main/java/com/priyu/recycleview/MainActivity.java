package com.priyu.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Example_item> exampleItems;
    private Button buttonAdd, buttonDelete;
    private EditText editTextAdd, editTextDelete;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    buttonAdd = findViewById(R.id.buttonadd);
    buttonDelete = findViewById(R.id.buttondelete);
    editTextAdd = findViewById(R.id.edittextadd);
    editTextDelete = findViewById(R.id.edittextdelete);

    generatedata();
    recyclerviewconfug();

    buttonAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           int position = Integer.parseInt(editTextAdd.getText().toString());
            addcard(position);
        }
    });
    buttonDelete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position = Integer.parseInt(editTextDelete.getText().toString());
            deletecard(position);

        }
    });
    }

    public void generatedata()
    {
        exampleItems = new ArrayList<>();
        exampleItems.add(new Example_item(R.drawable.twor, "clicked in this"));
        exampleItems.add(new Example_item(R.drawable.oner, "clicked in this"));
        exampleItems.add(new Example_item(R.drawable.threer, "clicked in this"));
        exampleItems.add(new Example_item(R.drawable.fourr, "clicked in this"));
        exampleItems.add(new Example_item(R.drawable.fiver, "clicked in this"));
        exampleItems.add(new Example_item(R.drawable.sixr, "clicked in this"));
    }

    public void recyclerviewconfug() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new Example_adapter(exampleItems);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void addcard(int position)
    {
        exampleItems.add(position,new Example_item(R.drawable.oner,"clicked on this"));
        adapter.notifyItemInserted(position);
    }

    public void deletecard(int position)
    {
        exampleItems.remove(position);
        adapter.notifyItemRemoved(position);
    }
}