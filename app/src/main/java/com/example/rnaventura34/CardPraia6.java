package com.example.rnaventura34;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CardPraia6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_praia6);

        Button goToWebsiteButton = findViewById(R.id.goToWebsiteButton);
        goToWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // URL do site que deseja abrir
                String url = "https://rnaventura.000webhostapp.com/index.html";

                // Cria um Intent com a ação ACTION_VIEW e a URI do site
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                // Verifica se há algum navegador disponível para abrir a URL
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Abre o navegador com a URL especificada
                    startActivity(intent);
                }
            }
        });
    }
}