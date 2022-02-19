package com.example.assignmentloancalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solution(View view) {
        //Enter the loan amount
        EditText principal = (EditText) findViewById(R.id.loanAmount);
        int LoanAmount = Integer.parseInt(principal.getText().toString());

        //Enter the interest rate
        EditText intRate = (EditText) findViewById(R.id.loanInterest);
        int rate = Integer.parseInt(intRate.getText().toString());

        //Calculation for EMI using for loop
        for (int i = 1; i <= 6; i++) {
            double emiOutput = (LoanAmount*((float)rate/12/100)*((Math.pow((1+((float)rate/12/100)),(12*i*5)))/(((Math.pow((1+((float)rate/12/100)),(12*i*5))))-1)));
            if (i == 1) {
                TextView emiTextView1 = (TextView) findViewById(R.id.textView1);
                emiTextView1.setText("Monthly payment for 5 years " + emiOutput);
            } else if (i == 2) {
                TextView emiTextView2 = (TextView) findViewById(R.id.textView2);
                emiTextView2.setText("Monthly payment for 10 years " + emiOutput);
            }else if (i==3){
                TextView emiTextView3 = (TextView) findViewById(R.id.textView3);
                emiTextView3.setText("Monthly payment for 15 years " + emiOutput);
            }else if(i==4){
                TextView emiTextView4 = (TextView) findViewById(R.id.textView4);
                emiTextView4.setText("Monthly payment for 20 years " + emiOutput);
            }else if(i==5){
                TextView emiTextView5 = (TextView) findViewById(R.id.textView5);
                emiTextView5.setText("Monthly payment for 25 years " + emiOutput);
            }else{
                TextView emiTextView6 = (TextView) findViewById(R.id.textView6);
                emiTextView6.setText("Monthly payment for 30 years "+ emiOutput);
            }

        }
    }
}