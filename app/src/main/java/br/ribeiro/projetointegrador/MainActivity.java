package br.ribeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMedidas;
    Button buttonCompartilhar;
    Button buttonEncontrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEncontrar = findViewById(R.id.buttonEncontrar);
        buttonMedidas = findViewById(R.id.buttonMedidas);
        buttonCompartilhar = findViewById(R.id.buttonCompartilhar);

        buttonEncontrar.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),EncontrarBike.class));
            finish();
        });

        buttonMedidas.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),MedidasSeguranca.class));
            finish();
        });

        buttonCompartilhar.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),CompartilharBike.class));
            finish();
        });

        /**
        buttonEncontrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EncontrarBike.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMedidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MedidasSeguranca.class);
                startActivity(intent);
                finish();
            }
        });

        buttonCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CompartilharBike.class);
                startActivity(intent);
                finish();
            }
        });
         **/
    }
}