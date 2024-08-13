package com.jonatas.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "Acredite em você.",
                "Faça acontecer.",
                "Seja a mudança.",
                "Sonhe grande.",
                "Nunca desista.",
                "Viva o agora.",
                "Você é capaz.",
                "Persistência é chave.",
                "Siga em frente.",
                "O impossível é temporário.",
                "Seja positivo.",
                "Aproveite cada momento.",
                "O sucesso é a soma de pequenos esforços.",
                "Tudo começa com um passo.",
                "Viva com paixão.",
                "A vitória pertence aos persistentes.",
                "Supere seus limites.",
                "Transforme sonhos em realidade.",
                "A atitude é tudo.",
                "Seja seu próprio herói."
        };
        int indice = new Random().nextInt(frases.length);
        TextView textView = findViewById(R.id.txt_frase);

        textView.setText(frases[indice]);
    }
}