package br.ribeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MedidasSeguranca extends AppCompatActivity {

    TextView textVoltar;
    Button buttonPedalar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas_seguranca);

        textVoltar = findViewById(R.id.textVoltar);
        buttonPedalar = findViewById(R.id.buttonPedalar);

        buttonPedalar.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),EncontrarBike.class));
            finish();
        });

        textVoltar.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        });

        /**
        buttonPedalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),EncontrarBike.class);
                startActivity(intent);
                finish();

            }
        });

        textVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        **/
    }
}