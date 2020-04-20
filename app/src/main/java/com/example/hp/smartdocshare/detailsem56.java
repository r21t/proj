package com.example.hp.smartdocshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class detailsem56 extends AppCompatActivity {

    Button b1, b2, b3, b4;
    String sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsem56);

        b1 = findViewById(R.id.button4);
        b2 = findViewById(R.id.button5);
        b3 = findViewById(R.id.button6);
        b4 = findViewById(R.id.button7);

        Intent data = getIntent();
        sem = data.getStringExtra("sem");

        //Toast.makeText(getApplicationContext(),sem,Toast.LENGTH_SHORT).show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(detailsem56.this, Assignments.class);
                in.putExtra("s", sem);

                startActivity(in);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(detailsem56.this, books.class);
                in.putExtra("s", sem);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(detailsem56.this, questions.class);
                in.putExtra("s", sem);
                startActivity(in);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(detailsem56.this, detailsem12.class);
                in.putExtra("s", sem);
                startActivity(in);
            }
        });
    }
}
