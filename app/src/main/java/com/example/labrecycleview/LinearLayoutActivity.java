package com.example.labrecycleview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.labrecycleview.fragments.GridLayoutFragment;
import com.example.labrecycleview.fragments.LinearVerticalFragment;
import com.example.labrecycleview.fragments.LinearHorizontalFragment;

public class LinearLayoutActivity extends AppCompatActivity {

    FloatingActionButton fab;
    Button btnHorizontal, btnVertical, btnGrid;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnHorizontal = findViewById(R.id.btn_horizontal);
        btnVertical = findViewById(R.id.btn_vertical);
        btnGrid = findViewById(R.id.btn_grid);
        title = findViewById(R.id.txt_title);
        fab = findViewById(R.id.fab);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_fragment, new LinearVerticalFragment(fab))
                .commit();

        btnHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_fragment, new LinearHorizontalFragment(fab))
                        .commit();

                title.setText("Linear Layout Horizontal");

            }
        });

        btnVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_fragment, new LinearVerticalFragment(fab))
                        .commit();

                title.setText("Linear Layout Vertical");
            }
        });

        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_fragment, new GridLayoutFragment(fab))
                        .commit();

                title.setText("Grid Layout Manager");
            }
        });


    }

}
