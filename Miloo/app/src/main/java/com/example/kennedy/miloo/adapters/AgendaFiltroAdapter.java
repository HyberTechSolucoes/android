package com.example.kennedy.miloo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.domain.AgendaFiltro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felipe on 30/07/2017.
 */

public class AgendaFiltroAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public AgendaFiltroAdapter(Context context, int resource) {
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
        AgendaFiltroAdapter.DataHandler handler;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.fragment_agenda_filtro_item, parent, false);
            handler = new AgendaFiltroAdapter.DataHandler();
            handler.titulo = (TextView) row.findViewById(R.id.textView_titulo_agenda_filtro);
            row.setTag(handler);
        }
        else {
            handler = (AgendaFiltroAdapter.DataHandler) row.getTag();
        }
        AgendaFiltro dataProvider;
        dataProvider = (AgendaFiltro)this.getItem(position);
        handler.titulo.setText(dataProvider.getAgenda_Filtro_titulo());

        return row;
    }
}
