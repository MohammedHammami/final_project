package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;


import android.os.Bundle;
import android.widget.ImageView;

public class BuildingUsersProfile3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_users_profile3);

        ImageView imageView = findViewById(R.id.food1);
        Glide.with(this)
            .load(R.drawable.foodno1)
            .circleCrop()
            .into(imageView);
        ImageView imageView1 = findViewById(R.id.food2);
        Glide.with(this)
                .load(R.drawable.foodno2)
                .circleCrop()
                .into(imageView1);
        ImageView imageView2 = findViewById(R.id.food3);
        Glide.with(this)
                .load(R.drawable.foodno3)
                .circleCrop()
                .into(imageView2);
        ImageView imageView3 = findViewById(R.id.food4);
        Glide.with(this)
                .load(R.drawable.foodno4)
                .circleCrop()
                .into(imageView3);

    }
}