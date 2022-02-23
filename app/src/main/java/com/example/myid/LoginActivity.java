package com.example.myid;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AssetManager assetManager = getAssets();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        try {
            InputStream ims = assetManager.open("images-5.jpg");
            Drawable d = Drawable.createFromStream(ims, null);
            imageView.setImageDrawable(d);

            InputStream ims2 = assetManager.open("images-6.jpg");
            Drawable d2 = Drawable.createFromStream(ims2, null);
            imageView2.setImageDrawable(d2);


        } catch (IOException ex) {
            return;
        }
    }
}
