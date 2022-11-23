package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    CheckBox checkbox_1;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        checkbox_1 = (CheckBox) findViewById(R.id.checkbox_1);
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

    }

    public void onClick(View view) {

        EditText Nomeproduto = (EditText) findViewById(R.id.nomeproduto);
        EditText Precoproduto = (EditText) findViewById(R.id.precoproduto);

        if ( Nomeproduto.getText().length() == 0 ) {
            Toast toast = Toast.makeText(this, "Informe o nome do produto", Toast.LENGTH_SHORT);
            toast.show();
        } else if (Precoproduto.getText().length() == 0) {
            Toast toast = Toast.makeText(this, "Informe o preço do produto", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Dados informados: \n Nome do produto: \n Preço do produto: \n Produto importado: ", Toast.LENGTH_SHORT);
            toast.show();
        }


    }
}