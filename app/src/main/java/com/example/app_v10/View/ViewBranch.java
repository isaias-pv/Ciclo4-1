package com.example.app_v10.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.app_v10.R;

public class ViewBranch extends AppCompatActivity {

    Drawable drawable1, drawable2;
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_branch);

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.sucursal_1, getTheme());

        img1 = (ImageView) findViewById(R.id.branch_img_one);
        img1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.sucursal_2, getTheme());

        img2 = (ImageView) findViewById(R.id.branch_img_two);
        img2.setImageDrawable(drawable2);

    }
}