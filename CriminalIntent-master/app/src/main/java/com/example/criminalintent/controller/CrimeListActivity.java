package com.example.criminalintent.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.criminalintent.R;

public class CrimeListActivity extends AppCompatActivity {



    // View
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_list);

        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentById(R.id.fragment_container) == null) {

            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, new CrimeListFragment())
                    .commit();
        }
    }


}
