package com.example.cours3hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private ArrayList<String> persons;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView=findViewById(R.id.recyler_view);
            persons = new ArrayList<>();
            recyclerView.setAdapter(new PersonAdapter(persons));
            persons.add("john weak");
            persons.add("hitmen");
            persons.add("agent 007");
            persons.add("rembo");
            persons.add("terminator");


        }
    }
}