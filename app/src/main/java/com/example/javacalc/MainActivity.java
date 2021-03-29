package com.example.javacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView rezultateTV;
    TextView workingsTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();



    }

    private void initTextViews() {

        workingsTV=(TextView)findViewById(R.id.workings)
    }

    public void clearOnClick(View view) {
    }

    public void bracketsOnClick(View view) {
    }

    public void oneOnClick(View view) {
    }

    public void sixOnClick(View view) {
    }

    public void threeOnClick(View view) {
    }

    public void twoOnClick(View view) {
    }

    public void fiveOnClick(View view) {
    }

    public void fourOnClick(View view) {
    }

    public void nineOnClick(View view) {
    }

    public void eightOnClick(View view) {
    }

    public void sevenOnClick(View view) {
    }

    public void zeroOnClick(View view) {
    }

    public void decimalOnClick(View view) {
    }

    public void plusOnClick(View view) {
    }

    public void minusOnClick(View view) {
    }

    public void equalsOnClick(View view) {
    }

    public void divideOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void invertOnClick(View view) {
    }
}