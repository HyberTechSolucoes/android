package com.example.kennedy.miloo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AvaliarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliar);


        //Lista de sim e não
        Spinner staticSpinner_sim_nao = (Spinner) findViewById(R.id.lista_atendimento_avaliar);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter_sim_nao = ArrayAdapter
                .createFromResource(this, R.array.sim_nao,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter_sim_nao
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner_sim_nao.setAdapter(staticAdapter_sim_nao);

        //Lista de um a dez
        Spinner staticSpinner_um_dez = (Spinner) findViewById(R.id.lista_nota_avaliar);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter_um_dez = ArrayAdapter
                .createFromResource(this, R.array.um_dez,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter_um_dez
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner_um_dez.setAdapter(staticAdapter_um_dez);








        }
    }


