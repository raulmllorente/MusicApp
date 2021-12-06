package com.example.musicapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class AlbumListIzFragment extends ListFragment {
    private long AlbumListID;

    public AlbumListIzFragment() {

    }

    static interface Listener {
        void itemCliked(long id);
    }

    private AlbumListIzFragment.Listener m_listener;

    @Override
    public void onAttach (Context context)
    {
        super.onAttach(context);
        m_listener = (AlbumListIzFragment.Listener) context;
    }

    @Override
    public void onListItemClick (ListView list, View item, int position, long id){
        if (m_listener != null){
            m_listener.itemCliked(id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        String [] names = new String[AlbumData.IZList.length];
        for (int i = 0; i < AlbumData.IZList.length; i++) {
            names[i] = AlbumData.IZList[i].name;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_iz_album_list, container, false);
    }

    public void setList (long id){
        AlbumListID = id;
    }
}
