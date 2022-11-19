package com.firtstprojectsuvojitsarker.androidvisiblity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button bgone , bshow, sToast, tsnap;
    LinearLayout mainLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        bgone = findViewById(R.id.bgone);
        bshow = findViewById(R.id.bshow);
        mainLayout = findViewById(R.id.mainLayout);
        sToast = findViewById(R.id.sToast);
        tsnap = findViewById(R.id.tsnap);


        bshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.VISIBLE);

            }
        });

        bgone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.INVISIBLE);
            }
        });

        tsnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setVisibility(View.GONE);
            }
        });

        sToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "toast is showing", Toast.LENGTH_LONG).show();
            }

        });
        tsnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setVisibility(View.GONE);
                Intent myIntent = new Intent(MainActivity.this, SecoundActivity.class);
                startActivity(myIntent);
            }
        });




    }
}