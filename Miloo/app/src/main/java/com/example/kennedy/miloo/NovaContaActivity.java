package com.example.kennedy.miloo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NovaContaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Esconde a barra de titulos
        getSupportActionBar().setElevation(0);
        setContentView(R.layout.activity_nova_conta);
    }
}
