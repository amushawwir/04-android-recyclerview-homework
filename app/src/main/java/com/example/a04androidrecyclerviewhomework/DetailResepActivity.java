package com.example.a04androidrecyclerviewhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailResepActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        ImageView imgResep = findViewById(R.id.imgResep);
        TextView tvResepName = findViewById(R.id.tvResepName);
        TextView tvResepDetail = findViewById(R.id.tvResepDetail);

        Resep resep = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (resep != null){
            Glide.with(this)
                    .load(resep.getPhoto())
                    .into(imgResep);
            tvResepName.setText(resep.getName());
            tvResepDetail.setText(resep.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Resep");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}