package com.example.musicapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MusicGroupListFragment extends ListFragment {
    private long groupID;

    public MusicGroupListFragment() {

    }

    static interface Listener {
        void itemCliked(long id);
    }

    private Listener m_listener;

    @Override
    public void onAttach (Context context)
    {
        super.onAttach(context);
        m_listener = (Listener) context;
    }

    @Override
    public void onListItemClick (ListView list, View item, int position, long id)
    {
        if (m_listener != null)
        {
            m_listener.itemCliked(id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] names = new String[AlbumData.AlbumList.length];

        for (int i = 0; i < AlbumData.AlbumList.length; i++){
            names[i] = AlbumData.AlbumList[i].name;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_music_group, container, false);
    }

    public void setGroup (long id){
        groupID = id;
    }
}
