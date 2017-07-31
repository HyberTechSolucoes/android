package com.example.kennedy.miloo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.domain.Agenda;

import java.util.ArrayList;
import java.util.List;


public class AgendaAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public AgendaAdapter(Context context, int resource) {
        super(context, resource);
    }

    static  class  DataHandler{
        ImageView imagem;
        TextView titulo;
        TextView subtitulo;
        TextView data;
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
        AgendaAdapter.DataHandler handler;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.fragment_agenda_item, parent, false);
            handler = new AgendaAdapter.DataHandler();
            handler.titulo = (TextView) row.findViewById(R.id.textView_titulo_agenda);
            handler.subtitulo = (TextView) row.findViewById(R.id.textView_subtitulo_agenda);
            handler.data = (TextView) row.findViewById(R.id.textView_data_agenda);
            handler.imagem = (ImageView) row.findViewById(R.id.imageViewFoto);
            row.setTag(handler);
        }
        else {
            handler = (AgendaAdapter.DataHandler) row.getTag();
        }
        Agenda dataProvider;
        dataProvider = (Agenda)this.getItem(position);
        handler.imagem.setImageResource(dataProvider.getAgenda_img());
        handler.titulo.setText(dataProvider.getAgenda_titulo());
        handler.subtitulo.setText(dataProvider.getAgenda_subtitulo());
        handler.data.setText(dataProvider.getAgenda_cidade());

        return row;
    }
}
