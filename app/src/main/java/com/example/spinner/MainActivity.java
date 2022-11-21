package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner miSpinner, miSpinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miSpinner = (Spinner) findViewById(R.id.spnOpciones);
        String [] valores = {"valor1","valor2","valor3"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,valores);
        miSpinner.setAdapter(adaptador);

        miSpinner3 = (Spinner) findViewById(R.id.spnOpciones3);

        ArrayAdapter<CharSequence> adaptador2 = ArrayAdapter.createFromResource(this,R.array.valores, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item );
        miSpinner3.setAdapter(adaptador2);



    }
}