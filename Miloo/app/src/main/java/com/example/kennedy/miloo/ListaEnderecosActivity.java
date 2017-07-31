package com.example.kennedy.miloo;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kennedy.miloo.adapters.ListaEnderecosAdapter;
import com.example.kennedy.miloo.domain.ListaEnderecos;

public class ListaEnderecosActivity  extends AppCompatActivity {

    ListView listView;

    // Passar array de imagens para lista_enderecos
    //int[] img_notificacao = {}

    String[] lista_enderecos_titulo;
    String[] lista_enderecos_subtitulo;
    String[] lista_enderecos_cidade;
    ListaEnderecosAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_enderecos);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }


        listView = (ListView) findViewById(R.id.list_view_lista_enderecos);
        lista_enderecos_titulo = getResources().getStringArray(R.array.lista_titulo);
        lista_enderecos_subtitulo = getResources().getStringArray(R.array.lista_subtitulo);
        lista_enderecos_cidade = getResources().getStringArray(R.array.lista_extra);

        int i = 0;
        adapter = new ListaEnderecosAdapter(getApplicationContext(), R.layout.fragment_lista_enderecos_item);
        listView.setAdapter(adapter);
        for(String titulo: lista_enderecos_titulo) {
//
            ListaEnderecos dataProvider = new ListaEnderecos(R.drawable.pin_icon, titulo, lista_enderecos_subtitulo[i],lista_enderecos_cidade[i] );
            adapter.add(dataProvider);
            i++;
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
