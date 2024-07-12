package dev.amitb.a24b_and2_hw2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import dev.amitb.custombuttons.CustomButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomButton customButton = findViewById(R.id.custom_button);
        customButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Custom Button Clicked!", Toast.LENGTH_SHORT).show();
        });

        customButton.setCornerRadius(24f);
        customButton.setOutlineButton(true);
        customButton.setCornerRadius(24f);
        customButton.setCustomBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        customButton.setOutlineColor(getResources().getColor(android.R.color.holo_blue_dark));
        customButton.setStrokeWidth(10f);
        customButton.setTextColor(Color.BLACK);
        customButton.setTextSize(24f);
    }
}