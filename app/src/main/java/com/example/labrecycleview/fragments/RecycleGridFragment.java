package com.example.labrecycleview.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.labrecycleview.R;
import com.example.labrecycleview.adapters.GridAdapter;
import com.example.labrecycleview.adapters.LineAdapter;
import com.example.labrecycleview.models.UserModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleGridFragment extends Fragment {

    RecyclerView mRecyclerView;
    GridAdapter mAdapter = new GridAdapter(new ArrayList<>(0));
    View view;
    FloatingActionButton fab;

    public RecycleGridFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public RecycleGridFragment(FloatingActionButton fab) {
        this.fab = fab;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_recycle_grid, container, false);
        mRecyclerView = view.findViewById(R.id.grid_recycle_view);
        setupRecycler();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                UserModel userModel = new UserModel();
                userModel.setName("Grid View Filipe");
                userModel.setAge(24);
                userModel.setCity("Uruaçu");
                userModel.setText("Aqui é um texto de texte para textar o texto, sacou?");
                mAdapter.updateList(userModel);
            }
        });

        return view;
    }

    private void setupRecycler(){
        // Configurando o gerenciador de layout para ser HORIZONTAL.
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        // Adiciona o adapter que irá anexar os objetos à lista.
        // Está sendo criado com lista vazia, pois será preenchida posteriormente.

        mRecyclerView.setAdapter(mAdapter);

    }

}
