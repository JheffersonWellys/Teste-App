package com.h4rzel.spacebarbershop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.firestore.FirebaseFirestore;

public class Activity_Cadastro extends AppCompatActivity {

    private EditText T02_EdtTx_Nome, T02_EdtTx_RazaoSocial, T02_EdtTx_Telefone, T02_EdtTx_Cnpj,
            T02_EdtTx_Cidade, T02_EdtTx_Endereco, T02_EdtTx_Email, T02_EdtTx_Senha;
    private Button T02_AppCmpBtn_Entrar;

    String[] mensagens = {"Preencha todos os campos!", "Cadastro realizado!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        IniciarComponentes();

        T02_AppCmpBtn_Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = T02_EdtTx_Nome.getText().toString();
                String email = T02_EdtTx_Email.getText().toString();
                String senha = T02_EdtTx_Senha.getText().toString();
                String telefone = T02_EdtTx_Telefone.getText().toString();
                String cidade = T02_EdtTx_Cidade.getText().toString();

                if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || telefone.isEmpty() || cidade.isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    CadastrarUsuario(v);
                }
            }});

    }
    private void CadastrarUsuario(View v){


        String email = T02_EdtTx_Email.getText().toString();
        String senha = T02_EdtTx_Senha.getText().toString();

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Snackbar snackbar = Snackbar.make(v, mensagens[1], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else{
                    String erro;
                    try {
                        throw task.getException();
                    }catch (FirebaseAuthWeakPasswordException e){
                        erro = "Digite uma senha com 6 caracteres!";
                    } catch (FirebaseAuthUserCollisionException e){
                        erro= "Conta ja cadastrada!";
                    } catch (FirebaseAuthInvalidCredentialsException e){
                        erro = "Email invalido!";
                    } catch (Exception e){
                        erro = "Erro ao cadastrar o usuario!";
                    }
                    Snackbar snackbar = Snackbar.make(v, erro, Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }
            }
        });


        FirebaseFirestore db= FirebaseFirestore.getInstance();

    }
    private void IniciarComponentes(){
        T02_EdtTx_Nome= findViewById(R.id.T02_EdtTx_Nome);
        T02_EdtTx_RazaoSocial= findViewById(R.id.T02_EdtTx_RazaoSocial);
        T02_EdtTx_Telefone= findViewById(R.id.T02_EdtTx_Telefone);
        T02_EdtTx_Cnpj= findViewById(R.id.T02_EdtTx_Cnpj);
        T02_EdtTx_Cidade= findViewById(R.id.T02_EdtTx_Cidade);
        T02_EdtTx_Endereco= findViewById(R.id.T02_EdtTx_Endereco);
        T02_EdtTx_Email= findViewById(R.id.T02_EdtTx_Email);
        T02_EdtTx_Senha= findViewById(R.id.T02_EdtTx_Senha);
        T02_AppCmpBtn_Entrar= findViewById(R.id.T02_AppCmpBtn_Entrar);
    }

}

