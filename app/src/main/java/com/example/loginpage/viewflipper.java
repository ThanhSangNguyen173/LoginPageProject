package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

public class viewflipper extends AppCompatActivity {
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewflipper_page);
        viewFlipper = (ViewFlipper)findViewById(R.id.ViewFlipper);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
    }
}