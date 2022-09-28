package com.example.a04androidrecyclerviewhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvResep;
    private ArrayList<Resep> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep = findViewById(R.id.rv_resep);
        rvResep.setHasFixedSize(true);

        list.addAll(ResepData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ListResepAdapter listResepAdapter = new ListResepAdapter(list);
        rvResep.setAdapter(listResepAdapter);

        listResepAdapter.setOnItemClickCallback(new ListResepAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Resep resep) {
                Intent moveIntent = new Intent(MainActivity.this, DetailResepActivity.class);
                moveIntent.putExtra(DetailResepActivity.ITEM_EXTRA, resep);
                startActivity(moveIntent);
            }
        });
    }


}