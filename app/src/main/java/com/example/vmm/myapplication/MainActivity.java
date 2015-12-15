package com.example.vmm.myapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("My Activity");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    public void click(View v) {
        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void click1(View v) {
        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, DemoRecycler.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void click2(View v) {
        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, CardLayout.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void click3(View v) {
        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
