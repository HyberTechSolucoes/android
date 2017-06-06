package com.example.kennedy.miloo;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.kennedy.miloo.libs.ConfiguracoesAdapter;
import com.example.kennedy.miloo.libs.ConfiguracoesDataProvider;

public class ConfiguracoesActivity  extends AppCompatActivity {

    ListView listView;

    String[] configuracoes_titulo;
    ConfiguracoesAdapter adapter;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#0D47A1"));
        }


        listView = (ListView) findViewById(R.id.list_view_activity_configuracoes);
        configuracoes_titulo = getResources().getStringArray(R.array.configuracoes_titulo);

        int i = 0;
        adapter = new ConfiguracoesAdapter(getApplicationContext(), R.layout.layout_item_lista_configuracoes);
        listView.setAdapter(adapter);
        for (String titulo : configuracoes_titulo) {
            ConfiguracoesDataProvider dataProvider = new ConfiguracoesDataProvider( titulo );
            adapter.add(dataProvider);
            i++;
        }

    }
}