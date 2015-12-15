package com.example.vmm.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {
    ArrayList<String> al = new ArrayList<>();
    ListView lv;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("My Activity");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        lv = (ListView) findViewById(R.id.listView);
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        al.add("Hello");
        adapter = new MyAdapter();
        lv.setAdapter(adapter);

    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int position) {
            return "";
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.singlelayout, parent, false);

            TextView tv = (TextView) convertView.findViewById(R.id.textView2);
            tv.setText(al.get(position));
            return convertView;
        }
    }

}
