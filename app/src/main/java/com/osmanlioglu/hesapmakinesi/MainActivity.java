package com.osmanlioglu.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1Text;
    EditText Number2Text;
    TextView ResultText;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1Text = findViewById(R.id.Number1Text);
        Number2Text = findViewById(R.id.Number2Text);
        ResultText = findViewById(R.id.ResultText);
        handler = new Handler();

    }




    public void sum(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else {
            Button clickedButton = (Button) view;
            ColorStateList colorStateList = ColorStateList.valueOf(Color.RED);
            clickedButton.setBackgroundTintList(colorStateList);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ColorStateList colorStateList = ColorStateList.valueOf(Color.BLUE);
                    clickedButton.setBackgroundTintList(colorStateList);
                }
            }, 500);


            float number1 = Integer.parseInt(Number1Text.getText().toString());

            float number2 = Integer.parseInt(Number2Text.getText().toString());
            float result = number1 + number2;
            ResultText.setText("Result: " + result);
        }
        }


    public void sub(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else {
            Button clickedButton = (Button) view;
            ColorStateList colorStateList = ColorStateList.valueOf(Color.RED);
            clickedButton.setBackgroundTintList(colorStateList);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ColorStateList colorStateList = ColorStateList.valueOf(Color.BLUE);
                    clickedButton.setBackgroundTintList(colorStateList);
                }
            }, 500);

            float number1 = Integer.parseInt(Number1Text.getText().toString());

            float number2 = Integer.parseInt(Number2Text.getText().toString());
            float result = number1 - number2;
            ResultText.setText("Result: " + result);
        }
    }

    public void multiplication(View view){
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else {
            Button clickedButton = (Button) view;
            ColorStateList colorStateList = ColorStateList.valueOf(Color.RED);
            clickedButton.setBackgroundTintList(colorStateList);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ColorStateList colorStateList = ColorStateList.valueOf(Color.BLUE);
                    clickedButton.setBackgroundTintList(colorStateList);
                }
            }, 500);
            float number1 = Integer.parseInt(Number1Text.getText().toString());

            float number2 = Integer.parseInt(Number2Text.getText().toString());
            float result = number1 * number2;
            ResultText.setText("Result: " + result);
        }
    }

    public void  division(View view){
        if(Number1Text.getText().toString().matches("")|| Number2Text.getText().toString().matches("")){
            ResultText.setText("Enter Number!");
        }
        else if (Number2Text.getText().toString().matches("0")){
            ResultText.setText("Error");
        }
        else {
            Button clickedButton = (Button) view;
            ColorStateList colorStateList = ColorStateList.valueOf(Color.RED);
            clickedButton.setBackgroundTintList(colorStateList);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ColorStateList colorStateList = ColorStateList.valueOf(Color.BLUE);
                    clickedButton.setBackgroundTintList(colorStateList);
                }
            }, 500);
            float number1 = Integer.parseInt(Number1Text.getText().toString());

            float number2 = Integer.parseInt(Number2Text.getText().toString());
            float result = number1 / number2;
            ResultText.setText("Result: " + result);
        }
    }


}