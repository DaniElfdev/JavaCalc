package com.example.javacalc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView resultsTV;
    TextView inputTV;

    String inputs = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();



    }

    private void initTextViews() {

        inputTV = (TextView)findViewById(R.id.inputTextView);
        resultsTV = (TextView)findViewById(R.id.resultsTextView);
    }

    private void setInputs(String givenValue)
    {
        inputs = inputs + givenValue;
        inputTV.setText(inputs);
    }

    public void equalsOnClick(View view)
    {
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try
        {
            result = (double)engine.eval(inputs);
        }

        catch (ScriptException e)
        {
            Toast.makeText(this, "Can Not Calculate Input", Toast.LENGTH_SHORT).show();
        }

        if(result !=null)
            resultsTV.setText(String.valueOf(result.doubleValue()));

    }

    public void clearOnClick(View view) {
        setInputs("");
        inputs="";
        resultsTV.setText("");

    }

    public void bracketsOnClick(View view) {
    }

    public void oneOnClick(View view) {
        setInputs("1");
    }

    public void sixOnClick(View view) {
        setInputs("6");
    }

    public void threeOnClick(View view) {
        setInputs("3");
    }

    public void twoOnClick(View view) {
        setInputs("2");
    }

    public void fiveOnClick(View view) {
        setInputs("5");
    }

    public void fourOnClick(View view) {
        setInputs("4");
    }

    public void nineOnClick(View view) {
        setInputs("9");
    }

    public void eightOnClick(View view) {
        setInputs("8");
    }

    public void sevenOnClick(View view) {
        setInputs("7");
    }

    public void zeroOnClick(View view) {
        setInputs("0");
    }

    public void decimalOnClick(View view) {
        setInputs(".");
    }

    public void plusOnClick(View view) {
        setInputs("+");
    }

    public void minusOnClick(View view) {
        setInputs("-");
    }



    public void divideOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void invertOnClick(View view) {
    }
}