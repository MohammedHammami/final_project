package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BuildingUsersProfile4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_users_profile4);

        ImageView imageView = findViewById(R.id.hypertension);
        Glide.with(this)
            .load(R.drawable.hypertension)
            .circleCrop()
            .into(imageView);
        ImageView imageView1 = findViewById(R.id.diabetes);
        Glide.with(this)
                .load(R.drawable.diabetes)
                .circleCrop()
                .into(imageView1);
        ImageView imageView2 = findViewById(R.id.cholesterol);
        Glide.with(this)
                .load(R.drawable.cholesterol)
                .circleCrop()
                .into(imageView2);
    }
}