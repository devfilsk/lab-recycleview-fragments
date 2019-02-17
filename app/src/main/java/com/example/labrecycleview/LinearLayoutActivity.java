package com.example.labrecycleview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.labrecycleview.adapters.LineAdapter;
import com.example.labrecycleview.fragments.ListaVerticalFragment;
import com.example.labrecycleview.models.UserModel;

import java.util.ArrayList;

public class LinearLayoutActivity extends AppCompatActivity {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_fragment, new ListaVerticalFragment(fab))
                .commit();


    }

}
