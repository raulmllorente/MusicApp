package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] album = new String[AlbumData.AlbumList.length];

        for (int i = 0; i < AlbumData.AlbumList.length; i++) {
            album[i] = AlbumData.AlbumList[i].name;
        }

        List<String> arrayListAlbum = new ArrayList<String>(Arrays.asList(album));

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayListAlbum);
        Button nButton = (Button) findViewById(R.id.button);
        EditText getValue = (EditText) findViewById(R.id.editText);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) listView.getItemAtPosition(position);

                switch(value){
                    case "Skrillex":
                        Intent intent1 = new Intent(MainActivity.this, AlbumListSkrDetail.class);
                        MainActivity.this.startActivity(intent1);
                        break;
                    case "Woody Jackson":
                        Intent intent2 = new Intent(MainActivity.this, AlbumListWjDetail.class);
                        MainActivity.this.startActivity(intent2);
                        break;
                    case "Inon Zur":
                        Intent intent3 = new Intent(MainActivity.this, AlbumListIzDetail.class);
                        MainActivity.this.startActivity(intent3);
                        break;
                }
            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayListAlbum.add(getValue.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}
