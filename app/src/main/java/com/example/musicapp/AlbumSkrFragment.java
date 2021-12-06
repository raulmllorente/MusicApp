package com.example.musicapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class AlbumSkrFragment extends Fragment {
    private long AlbumID;

    public AlbumSkrFragment(){

    }

    @Override
    public void onStart(){
        super.onStart();
        View v = getView();

        if (v != null)
        {
            ((TextView)v.findViewById(R.id.name)).setText(AlbumData.SkrList[(int)AlbumID].name);
            ((TextView)v.findViewById(R.id.year)).setText(AlbumData.SkrList[(int)AlbumID].year+"");
            ((ImageView)v.findViewById(R.id.image_view)).setImageResource(AlbumData.SkrList[(int)AlbumID].image);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_skr_album, container, false);
    }

    public void setAlbum (long id){
        AlbumID = id;
    }
}
