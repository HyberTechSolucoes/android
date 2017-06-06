package com.example.kennedy.miloo.libs;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.example.kennedy.miloo.R;

/**
 * Created by Felipe on 06/06/2017.
 */

public class ConfiguracoesAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public ConfiguracoesAdapter(Context context, int resource) {
        super(context, resource);
    }

    static  class  DataHandler{
        TextView titulo;
    }

    @Override
    public void add( Object object) {
        super.add(object);
        list.add(object);
    }

    //Quatidade de itens na lista
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.layout_item_lista_configuracoes, parent, false);
            handler = new DataHandler();
            handler.titulo = (TextView) row.findViewById(R.id.layout_item_titulo_configuracoea);
            row.setTag(handler);
        }
        else {
            handler = (DataHandler) row.getTag();
        }
        ConfiguracoesDataProvider dataProvider;
        dataProvider = (ConfiguracoesDataProvider) this.getItem(position);
        handler.titulo.setText(dataProvider.getConfiguracoes_titulo());

        return row;
    }
}
