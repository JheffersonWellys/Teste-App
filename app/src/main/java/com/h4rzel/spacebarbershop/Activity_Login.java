package com.h4rzel.spacebarbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_Login extends AppCompatActivity {

    private TextView T01_TxtVw_CliqueAquiNaoTemConta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        T01_TxtVw_CliqueAquiNaoTemConta = findViewById(R.id.T01_TxtVw_CliqueAquiNaoTemConta);
        T01_TxtVw_CliqueAquiNaoTemConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Login.this, Activity_Cadastro.class);
                startActivity(intent);

            }
        });
    }
}