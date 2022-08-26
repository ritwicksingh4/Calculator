package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double a;
    double b;
    double c;

    TextView ainput;
    TextView binput;
    TextView coutput;

    Button add;
    Button min;
    Button mul;
    Button div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addBTN(View view) {

        ainput = (TextView) findViewById(R.id.editTextNumberDecimal);
        binput = (TextView) findViewById(R.id.editTextNumberDecimal2);
        coutput = (TextView) findViewById(R.id.textView5) ;
        a=Float.parseFloat(ainput.getText() + "");
        b=Float.parseFloat(binput.getText() + "");
        c=a+b;
        coutput.setText(c + "");
    }

    public void minBTN(View view) {

        ainput = (TextView) findViewById(R.id.editTextNumberDecimal);
        binput = (TextView) findViewById(R.id.editTextNumberDecimal2);
        coutput = (TextView) findViewById(R.id.textView5) ;

        a=Float.parseFloat(ainput.getText() + "");
        b=Float.parseFloat(binput.getText() + "");
        c=a-b;
        coutput.setText(c + "");
    }

    public void mulBTN(View view) {

        ainput = (TextView) findViewById(R.id.editTextNumberDecimal);
        binput = (TextView) findViewById(R.id.editTextNumberDecimal2);
        coutput = (TextView) findViewById(R.id.textView5) ;

        a=Float.parseFloat(ainput.getText() + "");
        b=Float.parseFloat(binput.getText() + "");
        c=a*b;
        coutput.setText(c + "");
    }

    public void divBTN(View view) {

        ainput = (TextView) findViewById(R.id.editTextNumberDecimal);
        binput = (TextView) findViewById(R.id.editTextNumberDecimal2);
        coutput = (TextView) findViewById(R.id.textView5) ;

        a=Float.parseFloat(ainput.getText() + "");
        b=Float.parseFloat(binput.getText() + "");
        c=a/b;
        coutput.setText(c + "");
    }

}