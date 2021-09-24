package br.ribeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.glxn.qrgen.android.QRCode;

public class Reserva extends AppCompatActivity {

    ImageView imageReserva;
    TextView textLocal;
    TextView textHora;
    TextView textTotal;
    Button buttonCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        CharSequence local = getIntent().getStringExtra("local");
        CharSequence hora = getIntent().getStringExtra("hora");

        textTotal = findViewById(R.id.textTotal);
        textLocal = findViewById(R.id.textLocal);
        textHora = findViewById(R.id.textHora);
        imageReserva = findViewById(R.id.imageReserva);
        buttonCancelar = findViewById(R.id.buttonCancelar);

        textLocal.setText("Local: " + local);
        textHora.setText("Período Reservado: " + hora);
        textTotal.setText(calcularValor(hora));

        imageReserva.setImageBitmap(QRCode.from("Local:"+local+" Hora:"+hora).bitmap());

        buttonCancelar.setOnClickListener(e -> {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            });
    }

    private String calcularValor(CharSequence x){
            String n = Character.toString(x.charAt(0));
            Integer i = Integer.valueOf(n);
            Double valor = i * 2.50;
            return "Total a Pagar R$"+valor;
    }
}