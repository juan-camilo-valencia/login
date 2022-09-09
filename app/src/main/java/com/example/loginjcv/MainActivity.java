package com.example.loginjcv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void enviar(view view){
        EditText nombreeditText = findViewById(R.id.nombreeditText);
        EditText passwordeditText = findViewById(R.id.passwordeditText);

        log.i("nombre:",nombreeditText.getText().toString());
        log.i("password:",passwordeditText.getText().toString());




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}