package com.example.ramonsl.touristapp2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ramonsl.touristapp2.Models.Establish;
import com.example.ramonsl.touristapp2.R;

import java.util.List;

public class EstablishAdapter extends ArrayAdapter<Establish> {


    public EstablishAdapter(@NonNull Context context, @NonNull List<Establish> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Establish establish = getItem(position);

        View list = convertView;
        if (convertView == null) {
            list = LayoutInflater.from(getContext()).inflate(R.layout.establish_item, null);
        }

        TextView txtName = list.findViewById(R.id.txtNameEstablish);
        TextView txtFone = list.findViewById(R.id.txtFoneEstablish);
        TextView txtAddress = list.findViewById(R.id.txtAndressEstablish);


        txtName.setText(establish.getmName());
        txtFone.setText(establish.getmFone());
        txtAddress.setText(establish.getmAdress());


        return list;
    }
}
