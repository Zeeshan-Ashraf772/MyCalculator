package com.example.testingsdks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.examples.mycalculator.Calculate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate.Show(this,"Hello Friends");
    }
}