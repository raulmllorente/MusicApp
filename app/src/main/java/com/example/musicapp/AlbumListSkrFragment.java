package com.example.musicapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class AlbumListSkrFragment extends ListFragment {
    private long AlbumListID;

    public AlbumListSkrFragment() {

    }

    static interface Listener {
        void itemCliked(long id);
    }

    private AlbumListSkrFragment.Listener m_listener;

    @Override
    public void onAttach (Context context)
    {
        super.onAttach(context);
        m_listener = (AlbumListSkrFragment.Listener) context;
    }

    @Override
    public void onListItemClick (ListView list, View item, int position, long id){
        if (m_listener != null){
            m_listener.itemCliked(id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        String [] names = new String[AlbumData.SkrList.length];
        for (int i = 0; i < AlbumData.SkrList.length; i++) {
            names[i] = AlbumData.SkrList[i].name;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_skr_album_list, container, false);
    }

    public void setList (long id){
        AlbumListID = id;
    }
}
