package com.example.currencycoverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Function called by button press
    public void convertUSD(View view){

        EditText usdAmount = (EditText) findViewById(R.id.dollarNumber);

        //convert String to double
        Double usdAmountDouble = Double.parseDouble(usdAmount.getText().toString());

        //Convert USD to euro
        double poundAmount = usdAmountDouble * .88;

        Toast.makeText(MainActivity.this, "The pound amount is " + poundAmount, Toast.LENGTH_SHORT).show();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
