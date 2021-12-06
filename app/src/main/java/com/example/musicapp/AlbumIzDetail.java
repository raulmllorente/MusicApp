package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class AlbumIzDetail extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iz_album);

        Intent intent = getIntent();
        long id = intent.getLongExtra("ID", -1);

        AlbumIzFragment fragment = (AlbumIzFragment)getSupportFragmentManager().findFragmentById(R.id.album_iz_detail_fragment);
        fragment.setAlbum(id);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.share_action:
                return true;
        }
        return false;
    }
}
