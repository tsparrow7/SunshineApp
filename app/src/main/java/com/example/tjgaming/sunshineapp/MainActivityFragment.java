package com.example.tjgaming.sunshineapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> weatherData = new ArrayList<>();
        weatherData.add("Mon 5/31 - Sunny - 89/75");
        weatherData.add("Tue 6/1 - Cloudy - 81/61");
        weatherData.add("Wed 6/2 - Sunny - 81/55");
        weatherData.add("Thu 6/3 - Rainy - 75/57");
        weatherData.add("Fri 6/4 - Rainy - 75/61");
        weatherData.add("Sat 6/5 - Cloudy - 79/61");
        weatherData.add("Sun 6/6 - Rainy - 75/63");

        View root = inflater.inflate(R.layout.fragment_main, container, false);
        return root;
    }
}
