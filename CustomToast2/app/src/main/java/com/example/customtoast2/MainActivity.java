package com.example.customtoast2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater infla = getLayoutInflater();
                View value = infla.inflate(R.layout.customtoastlayout2, findViewById(R.id.layoutId));

                Toast to = new Toast(MainActivity.this);
                to.setGravity(Gravity.CENTER, 0, 0);
                to.setDuration(Toast.LENGTH_SHORT);
                to.setView(value);
                to.show();
            }
        });

    }
}