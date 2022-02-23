package com.example.myid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linear1 = findViewById(R.id.linear1);
        LinearLayout linear2 = findViewById(R.id.linear2);
        LinearLayout linear3 = findViewById(R.id.linear3);
        LinearLayout linear4 = findViewById(R.id.linear4);

        linear1.setOnClickListener(view -> navigateToLogin());

        linear2.setOnClickListener(view -> navigateToLogin());

        linear3.setOnClickListener(view -> navigateToLogin());

        linear4.setOnClickListener(view -> navigateToLogin());

        AssetManager assetManager = getAssets();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        try {
            InputStream ims = assetManager.open("images-1.jpg");
            Drawable d = Drawable.createFromStream(ims, null);
            imageView.setImageDrawable(d);

            InputStream ims2 = assetManager.open("images-2.jpg");
            Drawable d2 = Drawable.createFromStream(ims2, null);
            imageView2.setImageDrawable(d2);


            InputStream ims3 = assetManager.open("images-3.jpg");
            Drawable d3 = Drawable.createFromStream(ims3, null);
            imageView3.setImageDrawable(d3);

            InputStream ims4 = assetManager.open("images-4.jpg");
            Drawable d4 = Drawable.createFromStream(ims4, null);
            imageView4.setImageDrawable(d4);
        } catch (IOException ex) {
            return;
        }

    }


    void navigateToLogin (){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}