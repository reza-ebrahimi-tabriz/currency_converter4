package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText money;
    Button convert;

    Double amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        money=(EditText) findViewById(R.id.money);
        convert=(Button) findViewById(R.id.convert);
        convert.setOnClickListener(view -> {
           amount=Double.parseDouble(money.getText().toString());
            Toast.makeText(getApplicationContext(),String.valueOf(amount*12),Toast.LENGTH_LONG).show();
        });
    }
}