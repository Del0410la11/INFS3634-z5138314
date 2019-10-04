package com.example.assignment_1_infs3634;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<City_Time> citiesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TimeAdapter mAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mAdapter = new TimeAdapter(citiesList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareCityData();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void prepareCityData() {
        City_Time city = new City_Time("London", "10:07AM");
        citiesList.add(city);

        city = new City_Time("Sydney", "7:07PM");
        citiesList.add(city);

        city = new City_Time("Tokyo", "6:07PM");
        citiesList.add(city);

        city = new City_Time("Barcelona", "11:07AM");
        citiesList.add(city);

        city = new City_Time("New York", "5:07AM");
        citiesList.add(city);
    }

}
