package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StayActivity extends AppCompatActivity {

    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stay);

        back = findViewById(R.id.buttonr);
        image = findViewById(R.id.imagerocket);
        info = findViewById(R.id.inforocket);

        image.setImageResource(R.drawable.stay);
        info.setText(R.string.info_south);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StayActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });
    }
}

