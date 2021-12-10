package com.example.app_v10.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.app_v10.R;

public class ViewProduct extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3;
    ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.pan1, getTheme());

        img1 = (ImageView) findViewById(R.id.img1);
        img1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.pan2, getTheme());

        img2 = (ImageView) findViewById(R.id.img2);
        img2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.pan3, getTheme());

        img3 = (ImageView) findViewById(R.id.img3);
        img3.setImageDrawable(drawable3);

    }
}