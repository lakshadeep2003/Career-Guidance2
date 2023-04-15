package com.example.careerguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class CareerOptions extends AppCompatActivity {
    Spinner spin;
    TextView spin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_options);

        spin = findViewById(R.id.spinner);
        spin2 = findViewById(R.id.spinner2);

        String [] age = {"Select Career Option","Diploma Courses","Polytechnic Courses","Paramedical courses","ITI courses","Vocational courses"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,age);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        spin2.setText(R.string.one);
                        break;
                    case 2:
                        spin2.setText(R.string.two);
                        break;
                    case 3:
                        spin2.setText(R.string.three);
                        break;
                    case 4:
                        spin2.setText(R.string.four);
                        break;
                    case 5:
                        spin2.setText(R.string.five);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}