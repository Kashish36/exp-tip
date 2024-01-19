package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);

        back = findViewById(R.id.buttonr);
        image = findViewById(R.id.imagerocket);
        info = findViewById(R.id.inforocket);

        image.setImageResource(R.drawable.food);
        info.setText(R.string.info_trajec);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });
    }


}