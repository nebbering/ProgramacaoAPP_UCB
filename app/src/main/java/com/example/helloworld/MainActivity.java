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

    public void salvarInfo(View view) {

        EditText Nomeproduto = (EditText) findViewById(R.id.nomeproduto);
        EditText Precoproduto = (EditText) findViewById(R.id.precoproduto);

        String nomep = Nomeproduto.getText().toString();
        String precop = Precoproduto.getText().toString();

        if (Nomeproduto.getText().length() == 0 || Precoproduto.getText().length() == 0 ) {
            Toast toast = Toast.makeText(this, "Informe os campos obrigatórios!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            StringBuilder sb = new StringBuilder();
            sb +=  System.lineSeparator() + ""
            sb.append(nomep + "\n");
            sb.append(precop +"\n");
            Toast toast = Toast.makeText(this, "Dados informados: \n" + nomep + "\n" + precop, Toast.LENGTH_LONG);
            toast.show();
        }


    }
}