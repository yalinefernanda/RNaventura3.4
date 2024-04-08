package com.example.rnaventura34;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void teladois(View view){
        Intent entrar = new Intent(MainActivity.this, teste.class);
        startActivity(entrar);
    }
    public  void login(View view) {
        Intent Login = new Intent(MainActivity.this, TelaLogin.class);
        startActivity(Login);
    }
}