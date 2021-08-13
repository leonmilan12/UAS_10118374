//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TempatFragment extends Fragment {
    private RecyclerView rvTempat;
    private ArrayList<Tempat> list = new ArrayList<>();


    public TempatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tempat, container, false);
        rvTempat = view.findViewById(R.id.tempatFragment);
        rvTempat.setHasFixedSize(true);

        list.addAll(TempatData.getListTempat());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rvTempat.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListTempatAdapter listTempatAdapter = new ListTempatAdapter(list, requireContext());
        listTempatAdapter.setListTempat(list);
        rvTempat.setAdapter(listTempatAdapter);

    }
}