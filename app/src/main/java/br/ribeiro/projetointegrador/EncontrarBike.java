package br.ribeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EncontrarBike extends AppCompatActivity {

    Button buttonReserva;
    RadioGroup radioLocal;
    RadioGroup radioHora;
    TextView textVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontrar_bike);

        buttonReserva = findViewById(R.id.buttonReserva);
        radioLocal = findViewById(R.id.radioLocal);
        radioHora = findViewById(R.id.radioHora);
        textVoltar = findViewById(R.id.textVoltar3);

        textVoltar.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        });

        buttonReserva.setOnClickListener(e -> {

            RadioButton local = findViewById(radioLocal.getCheckedRadioButtonId());
            RadioButton hora = findViewById(radioHora.getCheckedRadioButtonId());
            Intent intent = new Intent(getApplicationContext(),Reserva.class);
            intent.putExtra("local",local.getText());
            intent.putExtra("hora",hora.getText());
            startActivity(intent);
            finish();

        });


        /**
        buttonReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton local = findViewById(radioLocal.getCheckedRadioButtonId());
                RadioButton hora = findViewById(radioHora.getCheckedRadioButtonId());
                 Intent intent = new Intent(getApplicationContext(),Reserva.class);
                 intent.putExtra("local",local.getText());
                 intent.putExtra("hora",hora.getText());
                 startActivity(intent);
                 finish();
            }
        });

        textVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        **/
    }
}