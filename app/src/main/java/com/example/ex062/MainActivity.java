package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    ImageView iv;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        sw = (Switch) findViewById(R.id.switch1);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton5);
        iv = (ImageView) findViewById(R.id.imageView);


    }

    public void Clicked(View view) {
        if (sw.isChecked()) {
            if (rb1.isChecked()) iv.setImageResource(R.drawable.green);
            if (rb2.isChecked()) iv.setImageResource(R.drawable.red);
            if (rb3.isChecked()) iv.setImageResource(R.drawable.yellow);
            if (rb4.isChecked()) iv.setImageResource(R.drawable.brown);
        }
    }

    public void RadioButtonClicked(View view) {
        if (sw.isChecked() == false) {
            iv.setImageResource(R.drawable.green);
        }
    }

    public void RadioButtonClicked2(View view) {
        if (sw.isChecked() == false) {
            iv.setImageResource(R.drawable.red);
        }
    }

    public void RadioButtonClicked3(View view) {
            if (sw.isChecked() == false) {
                iv.setImageResource(R.drawable.yellow);
            }
    }

    public void RadioButtonClicked4(View view) {
                if (sw.isChecked() == false) {
                    iv.setImageResource(R.drawable.brown);
                }
    }
}