package com.example.kennedy.miloo;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kennedy.miloo.adapters.AgendaAdapter;
import com.example.kennedy.miloo.adapters.AgendaFiltroAdapter;
import com.example.kennedy.miloo.domain.Agenda;
import com.example.kennedy.miloo.domain.AgendaFiltro;

public class AgendaFiltroActivity extends AppCompatActivity {

    ListView listView;

    // Passar array de imagens para lista_enderecos
    //int[] img_notificacao = {}

    String[] agenda_filtro_titulo;
    AgendaFiltroAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_filtro);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }


        listView = (ListView) findViewById(R.id.list_view_filtrar_agenda);
        agenda_filtro_titulo = getResources().getStringArray(R.array.lista_titulo);

        int i = 0;
        adapter = new AgendaFiltroAdapter(getApplicationContext(), R.layout.fragment_agenda_filtro_item);
        listView.setAdapter(adapter);
        for(String titulo: agenda_filtro_titulo) {
            AgendaFiltro dataProvider = new AgendaFiltro( titulo );
            adapter.add(dataProvider);
            i++;
        }

        listView = (ListView) findViewById(R.id.list_view_servicos_agenda);
        agenda_filtro_titulo = getResources().getStringArray(R.array.lista_titulo);

        i = 0;
        adapter = new AgendaFiltroAdapter(getApplicationContext(), R.layout.fragment_agenda_filtro_item);
        listView.setAdapter(adapter);
        for(String titulo: agenda_filtro_titulo) {
            AgendaFiltro dataProvider = new AgendaFiltro( titulo );
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
