package com.example.ramonsl.touristapp2.Fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ramonsl.touristapp2.Adapter.EstablishAdapter;
import com.example.ramonsl.touristapp2.Models.Establish;
import com.example.ramonsl.touristapp2.R;

import java.util.ArrayList;


public class RestaurantesFragment extends Fragment {


    EstablishAdapter adapter;
    ArrayList<Establish> lista;
    ListView listView;

    public RestaurantesFragment() {// Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_establish, container, false);
        listView = root.findViewById(R.id.listEstablish);
        lista = new ArrayList<>();

        Resources res = getResources();
        String[] stringArray = res.getStringArray(R.array.restaurante1);
        lista.add(new Establish(stringArray[0], stringArray[1], stringArray[2]));
        stringArray = res.getStringArray(R.array.restaurante2);
        lista.add(new Establish(stringArray[0], stringArray[1], stringArray[2]));
        stringArray = res.getStringArray(R.array.restaurante3);
        lista.add(new Establish(stringArray[0], stringArray[1], stringArray[2]));
        stringArray = res.getStringArray(R.array.restaurante4);
        lista.add(new Establish(stringArray[0], stringArray[1], stringArray[2]));

        adapter = new EstablishAdapter(getActivity(), lista);
        listView.setAdapter(adapter);
        return root;

    }

}
