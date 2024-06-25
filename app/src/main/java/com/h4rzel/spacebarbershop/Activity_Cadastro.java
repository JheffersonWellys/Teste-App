package com.h4rzel.spacebarbershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.inputmethod.InputContentInfoCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Cadastro extends AppCompatActivity {

    private TextView T04_TxtVw_NomeBarbearia, T04_TxVw_Endereco;
    private ImageView T04_ImgVw_Menu, T04_ImgVw_SelecionarBarbearia,T04_ImgVw_Barba,T04_ImgVw_Cabelo,
            T04_ImgVw_Sombrancelha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        IniciarComponentes();
        ConfigurarCliks();
    }

    private void IniciarComponentes() {
        T04_TxtVw_NomeBarbearia = findViewById(R.id.T04_TxtVw_NomeBarbearia);
        T04_TxVw_Endereco = findViewById(R.id.T04_TxVw_Endereco);
        T04_ImgVw_Menu = findViewById(R.id.T04_ImgVw_Menu);
        T04_ImgVw_SelecionarBarbearia = findViewById(R.id.T04_ImgVw_SelecionarBarbearia);
        T04_ImgVw_Barba = findViewById(R.id.T04_ImgVw_Barba);
        T04_ImgVw_Cabelo = findViewById(R.id.T04_ImgVw_Cabelo);
        T04_ImgVw_Sombrancelha = findViewById(R.id.T04_ImgVw_Sombrancelha);
    }

    private void ConfigurarCliks(){
        T04_ImgVw_Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        T04_ImgVw_SelecionarBarbearia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        T04_ImgVw_Barba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        T04_ImgVw_Cabelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        T04_ImgVw_Sombrancelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}