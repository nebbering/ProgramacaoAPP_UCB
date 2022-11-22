package com.example.helloworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvarInfo(View view) {

        Toast toast = Toast.makeText(this, "TESTANDO TOAST", Toast.LENGTH_SHORT);
        toast.show();

        EditText Nomeproduto = (EditText) findViewById(R.id.nomeproduto);
        EditText Precoproduto = (EditText) findViewById(R.id.precoproduto);


    }
}