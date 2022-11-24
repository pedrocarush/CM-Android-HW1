package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    EditText nome;
    EditText number;
    Button update;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nome = findViewById(R.id.nome);
        number = findViewById(R.id.number);
        update = findViewById(R.id.update);


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome1 = nome.getText().toString();
                String number1 = number.getText().toString();


                // Put the String to pass back into an Intent and close this activity
                Intent intent = new Intent();
                intent.putExtra("nome", nome1);
                intent.putExtra("number", number1);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}