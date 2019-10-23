package com.example.scrollexercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText texto;
    private TextView vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista = (TextView) findViewById(R.id.textView4);
        texto = (EditText) findViewById(R.id.editText);
    }

    public void añadirTexto(View view){
        String text = texto.getText().toString();
        vista.append(" "+text);
    }
}
