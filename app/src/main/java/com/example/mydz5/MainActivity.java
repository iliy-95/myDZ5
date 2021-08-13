package com.example.mydz5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {
int counter=0;
private EditText editText;


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonDELE;
    private Button buttonYM;
    private Button buttonRAV;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonTOCHKA;




    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.calcul_edittext);
        button1= findViewById(R.id.Butto1);
        button2= findViewById(R.id.Butto2);
        button3=findViewById(R.id.Butto3);
        button4= findViewById(R.id.Butto4);
        button5= findViewById(R.id.Butto5);
        button6= findViewById(R.id.Butto6);
        button7= findViewById(R.id.Butto7);
        button8= findViewById(R.id.Butto8);
        button9= findViewById(R.id.Butto9);
        button0= findViewById(R.id.Butto0);
        buttonDELE= findViewById(R.id.ButtoDELE);
        buttonYM= findViewById(R.id.ButtoYM);
        buttonRAV= findViewById(R.id.ButtoRAV);
        buttonPlus= findViewById(R.id.ButtonPlus);
        buttonMinus= findViewById(R.id.Buttonminus);
        buttonTOCHKA= findViewById(R.id.ButtoTOCHKA);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonDELE.setOnClickListener(this);
        buttonYM.setOnClickListener(this);
        buttonRAV.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonTOCHKA.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String num = "";
        switch (v.getId()) {
            case R.id.Butto0:
                num = "0";
                editText.setText(num);
                break;
            case R.id.Butto1:
                num = "1";
                editText.setText(num);
                break;
            case R.id.Butto2:
                num = "2";
                editText.setText(num);
                break;
            case R.id.Butto3:
                num = "3";
                editText.setText(num);
                break;
            case R.id.Butto4:
                num= "4";
                editText.setText(num);
                break;
            case R.id.Butto5:
                num = "5";
                editText.setText(num);
                break;
            case R.id.Butto6:
                num = "6";
                editText.setText(num);
                break;
            case R.id.Butto7:
                num = "7";
                editText.setText(num);
                break;
            case R.id.Butto8:
                num = "8";
                editText.setText(num);
                break;
            case R.id.Butto9:
                num = "9";
                editText.setText(num);
                break;
            case R.id.ButtoDELE:
                num = "/";
                editText.setText( num);
                break;
            case R.id.ButtoTOCHKA:
                num = ".";
                editText.setText( num);
                break;
            case R.id.ButtoRAV:
                num = "=";
                editText.setText( num);
                break;
            case R.id.Buttonminus:
                num = "-";
                editText.setText( num);
                break;
            case R.id.ButtoYM:
                num = "*";
                editText.setText( num);
                break;
            case R.id.ButtonPlus:
                num = "+";
                editText.setText( num);
                break;
        }
    }
}