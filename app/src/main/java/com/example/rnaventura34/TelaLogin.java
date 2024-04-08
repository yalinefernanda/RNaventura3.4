package com.example.rnaventura34;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TelaLogin extends AppCompatActivity {
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

    }

    public void telaCadastro(View view){
        Intent telacadastro = new Intent(TelaLogin.this,TelaCadastro.class);
        startActivity(telacadastro);
    }
        public void telaprincipal(View vew){
            Intent in = new Intent(TelaLogin.this, teste.class);
            startActivity(in);
        }

   }


