package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AlbumListWjDetail extends AppCompatActivity implements AlbumListWjFragment.Listener{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wj_list_album);
        Intent intent = getIntent();
        long id = intent.getLongExtra("ID", -1);
        AlbumListWjFragment fragment = (AlbumListWjFragment)getSupportFragmentManager().findFragmentById(R.id.album_list_fragment);
        fragment.setList(id);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void itemCliked(long id) {
        Intent intent = new Intent(this, AlbumWjDetail.class);
        intent.putExtra("ID", id);
        startActivity(intent);
    }
}
