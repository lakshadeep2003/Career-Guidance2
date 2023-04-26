package com.example.careerguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Set extends AppCompatActivity {
    RelativeLayout No,Policy,Terms,About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        No = findViewById(R.id.no);
        Policy = findViewById(R.id.policy);
        Terms = findViewById(R.id.terms);
        About = findViewById(R.id.about);

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8652691866"));
                startActivity(intent);
            }
        });

        Policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Set.this,Policy.class));
            }
        });

        Terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Set.this,Terms.class));
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Set.this,AboutUs.class));
            }
        });
    }
}