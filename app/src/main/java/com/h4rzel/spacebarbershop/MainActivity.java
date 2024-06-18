package com.h4rzel.spacebarbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
    public class MainActivity extends AppCompatActivity{
        private EditText usuarionomeEditText;
        private EditText senhaEditText;
        private Button loginButton;

        @Override
        protected void onCreate(Bundle saveInstanceState) {
            super.OnCreate(saveInstanceState);
            setContentView(R.layout.activity_main);

            usuarionomeEditText = findViewById(R.id.username);
            senhaEditText = findViewById(R.id.senha);
            loginButton = findViewById(R.id.loginButton);



        }
    }
}