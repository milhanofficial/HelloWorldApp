package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 5 & 6: Get references to Button and TextView
        Button myButton = findViewById(R.id.myButton);
        TextView myTextView = findViewById(R.id.myTextView);

        // Set a click listener on the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to run when the button is clicked
                myTextView.setText("The text has been changed!");
            }
        });
    }
}