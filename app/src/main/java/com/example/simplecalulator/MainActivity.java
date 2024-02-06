package com.example.simplecalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    TextView output;
    Button add,minus,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing the var
        input1 = findViewById(R.id.inputOne);
        input2 = findViewById(R.id.inputTwo);

        output = findViewById(R.id.output);

        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(input1.getText().toString());
                secondValue = Integer.parseInt(input2.getText().toString());
                result = (firstValue+secondValue);
                output.setText("Ans is "+result);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(input1.getText().toString());
                secondValue = Integer.parseInt(input2.getText().toString());
                result = (firstValue-secondValue);
                output.setText("Ans is "+result);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(input1.getText().toString());
                secondValue = Integer.parseInt(input2.getText().toString());
                result = (firstValue*secondValue);
                output.setText("Ans is "+result);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(input1.getText().toString());
                secondValue = Integer.parseInt(input2.getText().toString());
                result = (firstValue/secondValue);
                output.setText("Ans is "+result);
            }
        });

    }
}