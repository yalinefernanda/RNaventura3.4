package com.example.rnaventura34;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }

    public void telaLogin(View view) {
        Intent telalogin = new Intent(TelaCadastro.this, TelaLogin.class);
        startActivity(telalogin);
    }


}