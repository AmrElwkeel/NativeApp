package com.example.nativeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    TextView text;
//    EditText number1, number2;
    Button button2 , button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });

//        btn = findViewById(R.id.btn_new);
//        text = findViewById(R.id.txt2);
//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                text.setText("Hello World");
//                text.setTextColor(Color.GREEN);
//                btn.setText(R.string.test_app);
//                btn.setBackgroundColor(Color.GREEN);
//                btn.setTextColor(Color.WHITE);
//            }
//        });

    }



//    public void sumNumbers(View view) {
//
//        number1 = findViewById(R.id.num1);
//        number2 = findViewById(R.id.num2);
//        btn = findViewById(R.id.btn_new);
//        text = findViewById(R.id.txt2);
//        double num11 =Double.parseDouble(number1.getText().toString());
//        double num22 =Double.parseDouble(number2.getText().toString());
//        double result =( num11 + num22);
//        text.setText(result + "");
//
//
//    }

//    public void login(View v) {
//        findViewById(R.id.login).setEnabled(false);
//        ((Button)findViewById(R.id.login)).setText("Disable Button");
////        myView.setEnabled(false);
////
////        Button button = (Button) myView;
////        button.setText("Disable");
////        v.setEnabled(false);
////
////        Button button = (Button) v;
////        button.setText("Hello");
//    }

//    public void firstEdit(View view) {
//        Button btn =  findViewById(R.id.btn_new);
//        btn.setText(R.string.test_app);
//        btn.setBackgroundColor(Color.GREEN);
//        btn.setTextColor(Color.WHITE);
//    }
}
