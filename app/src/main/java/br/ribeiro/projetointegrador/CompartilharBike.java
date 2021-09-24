package br.ribeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CompartilharBike extends AppCompatActivity {

    TextView textVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartilhar_bike);

        textVoltar2 = findViewById(R.id.textVoltar2);

        textVoltar2.setOnClickListener(e -> {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });

        /**
        textVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        **/
    }
}