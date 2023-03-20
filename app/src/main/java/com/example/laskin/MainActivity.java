package com.example.laskin;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int result;

    private EditText giveNumber, giveNumber2;
    private TextView textOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giveNumber = findViewById(R.id.giveNumberOne);
        giveNumber2 = findViewById(R.id.giveNumberTwo);
        textOutput = findViewById(R.id.outcome);



    }

    public void addition(View view){
        result = parseInt(String.valueOf(giveNumber.getText())) + parseInt(String.valueOf(giveNumber2.getText()));

        textOutput.setText(String.valueOf(result));

    }
    public void subtraction(View view){
        result = parseInt(String.valueOf(giveNumber.getText())) - parseInt(String.valueOf(giveNumber2.getText()));

        textOutput.setText(String.valueOf(result));

    }

    public void division(View view){
        result = parseInt(String.valueOf(giveNumber.getText())) / parseInt(String.valueOf(giveNumber2.getText()));

        textOutput.setText(String.valueOf(result));

    }
    public void multiplication(View view){
        result = parseInt(String.valueOf(giveNumber.getText())) * parseInt(String.valueOf(giveNumber2.getText()));

        textOutput.setText(String.valueOf(result));

    }
}