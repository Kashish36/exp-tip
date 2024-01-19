package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class WelcActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welc);

        spinner = findViewById(R.id.spinner1);
        image = findViewById(R.id.image);
        String[] moon = {
                "Select",
                "Travel",
                "Food",
                "Stay",
                "Miscellaneous",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, moon);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        image.setImageResource(android.R.color.transparent);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.travel);
                        Intent launchi = new Intent(WelcActivity.this, TravelActivity.class);
                        startActivity(launchi);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.food);
                        Intent trajecti = new Intent(WelcActivity.this, FoodActivity.class);
                        startActivity(trajecti);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.stay);
                        Intent southi = new Intent(WelcActivity.this, StayActivity.class);
                        startActivity(southi);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.other);
                        Intent rocketi = new Intent(WelcActivity.this, OtherActivity.class);
                        startActivity(rocketi);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // DO ABSOLUTELY NOTHING WHEN NOTHING IS SELECTED
            }
        });
    }
}




