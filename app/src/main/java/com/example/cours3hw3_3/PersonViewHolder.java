package com.example.cours3hw3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPerson;
    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPerson=itemView.findViewById(R.id.text_person);
    }
    public void bind(String person){
        tvPerson.setText(person);
    }
}