package com.example.vmm.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DemoRecycler extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_recycler);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DemoRecycler.this, "Button Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }


    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.singlelayout, viewGroup, false);
            MyViewHolder pvh = new MyViewHolder(v);
            return pvh;
        }

        @Override
        public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
            myViewHolder.tv.setText("Hello World");
        }

        @Override
        public int getItemCount() {
            return 9;
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView tv;

            public MyViewHolder(View itemView) {
                super(itemView);
                tv = (TextView) itemView.findViewById(R.id.textView2);
            }
        }


    }

}