package com.example.rnaventura34;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class teste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

    }
    public void Praia1(View view){
        Intent praia1 = new Intent(teste.this, CardPraia1.class);
        startActivity(praia1);
    }

    public void praia2(View view){
        Intent Praia2 = new Intent(teste.this, CardPraia2.class);
        startActivity(Praia2);
    }
    public void praia3(View view){
        Intent Praia3 = new Intent(teste.this, CardPraia3.class);
        startActivity(Praia3);
    }
    public void praia4(View view){
        Intent Praia4 = new Intent(teste.this, CardPraia4.class);
        startActivity(Praia4);
    }
    public void praia5(View view){
        Intent Praia5 = new Intent(teste.this, CardPraia5.class);
        startActivity(Praia5);
    }
    public void praia6(View view){
        Intent Praia6 = new Intent(teste.this, CardPraia6.class);
        startActivity(Praia6);
    }
}