package com.example.ramonsl.touristapp2.Fragments;

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
        lista.add(new Establish("Pioneiro","Av. Castelo Branco 1750","51-36642186"));
        lista.add(new Establish("Molhes","Av. Barão do Rio Branco, 31\n","51-3664-1588"));
        lista.add(new Establish("Cantinho Do Pescador","Rua José Antonio Picoral, 240","3664-2670"));
        lista.add(new Establish("Churracaria Mirim","Av. Alfiero Zanardi, 1017","3664-5200"));
        lista.add(new Establish("Magas","Rua Balbino de Freitas","3664-1290"));
        adapter = new EstablishAdapter(getActivity(), lista);
        listView.setAdapter(adapter);
        return root;

    }

}
