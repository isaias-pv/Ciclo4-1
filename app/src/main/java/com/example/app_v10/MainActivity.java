package com.example.app_v10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.app_v10.View.*;

public class MainActivity extends AppCompatActivity {

    TextView text_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_Home = (TextView) findViewById(R.id.text_Home);
        text_Home.setText("1°ra version de la Aplicación de Panaderia");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.optionProducts) {
            Intent segundaPantalla = new Intent(this, ViewProduct.class);
            startActivity(segundaPantalla);
        }
        if (id == R.id.optionServices) {
            Intent terceraPantalla = new Intent(this, ViewService.class);
            startActivity(terceraPantalla);
        }
        if (id == R.id.optionBranches) {
            Intent cuartaPantalla = new Intent(this, ViewBranch.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}