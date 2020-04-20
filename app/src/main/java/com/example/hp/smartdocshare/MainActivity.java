package com.example.hp.smartdocshare;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

//import static com.example.hp.smartdocshare.R.id.id;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor editor;
    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("mp", 0);
        editor = sp.edit();
        b1 = findViewById(R.id.edu);
        b2 = findViewById(R.id.gn);
        b3 = findViewById(R.id.aboutus);
        b4 = findViewById(R.id.contactus);
        b5 = findViewById(R.id.logout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, edu_not.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, gn.class);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, aboutus.class);
                startActivity(in);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, contactus.class);
                startActivity(in);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                b.setTitle("welcome");
                b.setMessage("Are u sure u want to logout?");
                b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Cancel was clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        editor.remove("email");
                        editor.remove("password");
                        editor.remove("sem");
                        editor.commit();
                        editor.clear();
                        editor.commit();
                        Intent in = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(in);
                    }
                });
                b.create().show();
            }
        });

    }


    @Override
    public void onBackPressed() {

    }
}
