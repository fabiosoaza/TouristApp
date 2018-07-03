package com.example.ramonsl.touristapp2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramonsl.touristapp2.Models.Places;
import com.example.ramonsl.touristapp2.R;

import java.util.List;

public class PlacesAdapter extends ArrayAdapter<Places> {


    public PlacesAdapter(@NonNull Context context, @NonNull List<Places> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Places place = getItem(position);

        View list = convertView;
        if (convertView == null) {
            list = LayoutInflater.from(getContext()).inflate(R.layout.places_item, null);
        }

        TextView txtName = list.findViewById(R.id.txtName);
        TextView txtDesc = list.findViewById(R.id.txtDesc);
        ImageView imgView = list.findViewById(R.id.imgPlace);
        txtName.setText(place.getmName());
        txtDesc.setText(place.getmDesc());
        imgView.setImageResource(place.getmDraw());
        return list;
    }
}
