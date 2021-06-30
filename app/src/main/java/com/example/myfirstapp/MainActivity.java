package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);
    }

    public void onToastClick(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
        Snackbar.make(view,"Hello World", Snackbar.LENGTH_SHORT).show();
    }

    public void onCountClick(View view) {
        count++;
        textView.setText(count + "");
    }
}