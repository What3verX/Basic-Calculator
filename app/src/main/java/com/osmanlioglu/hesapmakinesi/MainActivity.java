package com.osmanlioglu.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1Text; //Number1Text isminde EditText turunden bir degisken yarattim.
    EditText Number2Text;
    TextView ResultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1Text = findViewById(R.id.Number1Text); //Yarattigim degiskeninin gorsel kisimda olusturdugum EditText oldugunu bildirdim.
        Number2Text = findViewById(R.id.Number2Text);
        ResultText = findViewById(R.id.ResultText);
    }
    public void topla(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }

        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString()); //Number1Text degiskenimin tuttugu texti alip stringe cevirip onu da integera cevirerek number1 adinda bir degiskene atadim.
            //number1 degiskenini goruntuledigimde artik Number1Text'e girilen sayiyi goruntuleyebilecegim.

            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 + number2;
            ResultText.setText("Result: " + result);
        }
    }

    public void cikar(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());

            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 - number2;
            ResultText.setText("Result: " + result);
        }
    }

    public void Carp(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());

            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 * number2;
            ResultText.setText("Result: " + result);
        }
    }

    public void  Bol(View view){
        if(Number1Text.getText().toString().matches("")|| Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else if (Number2Text.getText().toString().matches("0")){
            ResultText.setText("I don't know bro! wtf?");
        }
        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());

            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 / number2;
            ResultText.setText("Result: " + result);
        }
    }
}