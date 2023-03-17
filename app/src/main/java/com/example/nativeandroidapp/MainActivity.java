package com.example.nativeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v) {

        findViewById(R.id.login).setEnabled(false);
        ((Button)findViewById(R.id.login)).setText("Disable Button");

//        myView.setEnabled(false);
//
//        Button button = (Button) myView;
//        button.setText("Disable");
//        v.setEnabled(false);
//
//        Button button = (Button) v;
//        button.setText("Hello");


    }
}
