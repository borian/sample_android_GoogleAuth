package com.example.gauth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<ListItem> listItems;

    public CustomListAdapter(Context context, ArrayList<ListItem> listItems) {
        this.inflater = LayoutInflater.from(context);
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public ListItem getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return listItems.get(position).getView(inflater, convertView);
    }


    public static class ListItem {

        private String label;
        private String text;

        public ListItem(String label, String text) {
            this.label = label;
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public String getLabel() {
            return label;
        }

        public View getView(LayoutInflater inflater, View convertView) {
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.list_item, null);
            }
            TextView listLabel = (TextView) convertView.findViewById(R.id.list_item_label);
            TextView listText = (TextView) convertView.findViewById(R.id.list_item_text);
            listLabel.setText(getLabel());
            listText.setText(getText());
            return convertView;
        }
    }
}

