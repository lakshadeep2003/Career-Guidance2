package com.example.careerguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {
    EditText Feedback_name, Feedback_message, Feedback_phone,Feedback_email;
    Button feedbackbtn;

    FirebaseDatabase database;

    DatabaseReference reference;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Feedback_name = findViewById(R.id.Name);
        Feedback_message = findViewById(R.id.Message);
        Feedback_phone = findViewById(R.id.Phone);
        Feedback_email = findViewById(R.id.Email);
        feedbackbtn = findViewById(R.id.Feedbackbtn);

        feedbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!validateFeedback()){

                }else{
                    checkUser();
                }

            }
        });

    }

    private void checkUser() {
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("feedbacks");

        String name = Feedback_name.getText().toString();
        String message = Feedback_message.getText().toString();
        String phone = Feedback_phone.getText().toString();
        String email = Feedback_email.getText().toString();

        HelpClass helperClass = new HelpClass(name, message,email,phone);
        reference.child(name).setValue(helperClass);

        Toast.makeText(Feedback.this, "You have feedback successfully!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Feedback.this, Dashboard.class);
        startActivity(intent);
    }

    private boolean validateFeedback() {
        String name = Feedback_name.getText().toString();
        String message = Feedback_message.getText().toString();
        String phone = Feedback_phone.getText().toString();
        String email = Feedback_email.getText().toString();
        if (name.isEmpty()) {
            Feedback_name.setError("Enter Name");
        }else if (message.isEmpty()) {
            Feedback_message.setError("Enter Message");
        }else if (phone.isEmpty()) {
            Feedback_phone.setError("Enter Phone");
        }else if (!email.matches(emailPattern)) {
            Feedback_email.setError("Enter Proper Pattern of Email");
        }else {
            return true;
        }
        return false;
    }
}