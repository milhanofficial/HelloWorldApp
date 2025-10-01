package com.example.helloworldapp;
//Code for reverting
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

        Button myButton = findViewById(R.id.myButton);
        TextView myTextView = findViewById(R.id.myTextView);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("The text has been changed!");
            }
        });

        Button colorButton = findViewById(R.id.colorButton);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

        Button bgColorButton = findViewById(R.id.bgColorButton);
        bgColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View rootView = findViewById(android.R.id.content);
                rootView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
        });
    }
}