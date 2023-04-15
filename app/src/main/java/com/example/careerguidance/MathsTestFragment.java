package com.example.careerguidance;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MathsTestFragment extends Fragment {
    TextView Set_A,Set_B;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maths_test, container, false);
        Set_A = view.findViewById(R.id.SET_A);
        Set_B = view.findViewById(R.id.SET_B);

        Set_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Question_Page.class);
                startActivity(intent);
            }
        });
        Set_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Question_Page2.class);
                startActivity(intent);
            }
        });
        return  view;

    }
}