package com.example.kennedy.miloo;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kennedy.miloo.adapters.AgendaAdapter;
import com.example.kennedy.miloo.domain.Agenda;

public class AgendaActivity extends AppCompatActivity {

    ListView listView;

    // Passar array de imagens para lista_enderecos
    //int[] img_notificacao = {}

    String[] agenda_titulo;
    String[] agenda_subtitulo;
    String[] agenda_data;
    AgendaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }


        listView = (ListView) findViewById(R.id.list_view_agenda);
        agenda_titulo = getResources().getStringArray(R.array.lista_titulo);
        agenda_subtitulo = getResources().getStringArray(R.array.lista_subtitulo);
        agenda_data = getResources().getStringArray(R.array.lista_extra);

        int i = 0;
        adapter = new AgendaAdapter(getApplicationContext(), R.layout.fragment_agenda_item);
        listView.setAdapter(adapter);
        for(String titulo: agenda_titulo) {
//
            Agenda dataProvider = new Agenda(R.drawable.pin_icon, titulo, agenda_subtitulo[i],agenda_data[i] );
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
