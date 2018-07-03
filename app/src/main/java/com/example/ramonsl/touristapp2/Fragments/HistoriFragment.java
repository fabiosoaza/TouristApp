package com.example.ramonsl.touristapp2.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ramonsl.touristapp2.Adapter.PlacesAdapter;
import com.example.ramonsl.touristapp2.Models.Places;
import com.example.ramonsl.touristapp2.R;

import java.util.ArrayList;


public class HistoriFragment extends Fragment {

    PlacesAdapter adapter;
    ArrayList<Places> lista;
    ListView listView;

    public HistoriFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_places, container, false);
        listView = root.findViewById(R.id.listPlaces);
        lista = new ArrayList<>();
        lista.add(new Places(getString(R.string.igreja), getString(R.string.igreja_desc), R.drawable.igreja));
        lista.add(new Places(getString(R.string.monu), getString(R.string.monu_desc), R.drawable.monu));
        adapter = new PlacesAdapter(getActivity(), lista);
        listView.setAdapter(adapter);
        return root;
    }
}
