package com.example.gauth;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ActivityShowResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        Bundle extras = getIntent().getExtras();

        ArrayList<CustomListAdapter.ListItem> list = new ArrayList<CustomListAdapter.ListItem>();
        list.add(new CustomListAdapter.ListItem("json", extras.getString(ActivityMain.EXTRA_JSON_RESULT)));

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new CustomListAdapter(getApplicationContext(), list));
    }
}
