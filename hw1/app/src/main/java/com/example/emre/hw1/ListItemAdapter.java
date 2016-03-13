package com.example.emre.hw1;
import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Emre on 13.3.2016.
 */
public class ListItemAdapter extends ArrayAdapter<Listİtem> {

    int resourceId;
    ArrayList<Listİtem> list;
    Context context;

    public ListItemAdapter(Context context, Listİtem[] objects, int resourceId) {
        super(context, resourceId, objects);
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        final Listİtem objects= getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        }

        CheckBox chk = (CheckBox) convertView.findViewById(R.id.checkbox);
        ImageView img = (ImageView) convertView.findViewById(R.id.image);
        TextView product = (TextView) convertView.findViewById(R.id.product);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        Spinner spinner = (Spinner) convertView.findViewById(R.id.spinner);

        // Assign values from item to layout
        chk.setChecked(objects.isCheck());
        img.setImageResource(objects.getImage());
        product.setText(objects.getProduct());
        price.setText(String.valueOf(objects.getPrice()));
        //label3.setText(objects.getProduct());

        // Set operations &  Assign values from layout to item
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                objects.setCheck(isChecked);
            }
        });

        return convertView;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        final Listİtem list = getItem(position);


        if(convertView==null){
            // inflate the layout
            convertView = LayoutInflater.from(context).inflate(resourceId, parent, false);


        }


        // assign values



        return convertView;
    }


}
