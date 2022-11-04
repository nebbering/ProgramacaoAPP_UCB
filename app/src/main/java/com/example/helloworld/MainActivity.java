package com.example.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.helloworld.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somarValores(View view) {

        EditText edValor1 = (EditText) findViewById(R.id.valor1);
        EditText edValor2 = (EditText) findViewById(R.id.valor2);

        double valor1 = Double.parseDouble(edValor1.getText().toString());
        double valor2 = Double.parseDouble(edValor2.getText().toString());
        double resultado = valor1 + valor2;

        TextView txtResultado = (TextView) findViewById(R.id.resultado);
        txtResultado.setText("O valor da sima é = " + resultado);
    }
}