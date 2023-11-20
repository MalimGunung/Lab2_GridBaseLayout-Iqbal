package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class FullImageActivity  extends Activity {

    @Override
    public void onCreate(Bundle savedInstaceSate){
        super.onCreate(savedInstaceSate);
        setContentView(R.layout.full_images);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(ImageAdapter.thumbImages[position]);

        Toast.makeText(this, "Full view image " + position, Toast.LENGTH_SHORT).show();
    }
}
