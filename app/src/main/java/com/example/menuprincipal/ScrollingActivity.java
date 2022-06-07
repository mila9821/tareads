package com.example.menuprincipal;

import android.content.Intent;
import android.os.Bundle;

import com.example.menuprincipal.activities.AgenciasActivity;
import com.example.menuprincipal.activities.DestinoActivity;
import com.example.menuprincipal.activities.HotelesActivity;
import com.example.menuprincipal.activities.MuseoActivity;
import com.example.menuprincipal.activities.RestauranteActivity;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.menuprincipal.databinding.ActivityScrollingBinding;

public class ScrollingActivity extends AppCompatActivity {

    private ActivityScrollingBinding binding;
    Button destinos, restaurant, agencias, iglesias, conversor, hoteles, mapa, informacion, compartir, favoritos, cerca, buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
//        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        destinos = findViewById(R.id.btn_destinos);
        restaurant = findViewById(R.id.btn_restaurante);
        agencias = findViewById(R.id.btn_agencias);
        iglesias = findViewById(R.id.btn_museos);
        conversor = findViewById(R.id.btn_conversor);
        hoteles = findViewById(R.id.btn_hoteles);
        mapa = findViewById(R.id.btn_mapa);
        informacion = findViewById(R.id.btn_informacion);
        compartir = findViewById(R.id.bt_compartir);
        favoritos = findViewById(R.id.bt_favoritos);
        cerca = findViewById(R.id.bt_cerca);
        buscar = findViewById(R.id.bt_buscar);

        destinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, DestinoActivity.class);
                startActivity(intent);
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, RestauranteActivity.class);
                startActivity(intent);
            }
        });

        agencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, AgenciasActivity.class);
                startActivity(intent);
            }
        });

        iglesias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, MuseoActivity.class);
                startActivity(intent);
            }
        });

        hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, HotelesActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}