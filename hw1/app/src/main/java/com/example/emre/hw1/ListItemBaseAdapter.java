package com.example.emre.hw1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Emre on 13.3.2016.
 */
public class ListItemBaseAdapter extends BaseAdapter {
    int resourceId;
    ArrayList<Listİtem> list;
    Context context;

    public ListItemBaseAdapter(int resourceId, ArrayList<Listİtem> list, Context context) {
        this.resourceId = resourceId;
        this.list = list;
        this.context = context;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
