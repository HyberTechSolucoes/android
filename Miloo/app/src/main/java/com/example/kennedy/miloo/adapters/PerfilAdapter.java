package com.example.kennedy.miloo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.domain.Perfil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felipe on 06/08/2017.
 */

public class PerfilAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public PerfilAdapter(Context context, int resource) {
        super(context, resource);
    }

    static  class  DataHandler{
        TextView titulo;
        TextView subtitulo;
        TextView avaliacao;
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
        PerfilAdapter.DataHandler handler;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.fragment_perfil_item_aval, parent, false);
            handler = new PerfilAdapter.DataHandler();
            handler.titulo = (TextView) row.findViewById(R.id.textView_titulo_perfil);
            handler.subtitulo = (TextView) row.findViewById(R.id.textView_subtitulo_perfil);
            handler.avaliacao = (TextView) row.findViewById(R.id.textView_avaliacao_perfil);
            row.setTag(handler);
        }
        else {
            handler = (PerfilAdapter.DataHandler) row.getTag();
        }
        Perfil dataProvider;
        dataProvider = (Perfil)this.getItem(position);
        handler.titulo.setText(dataProvider.getPerfil_titulo());
        handler.subtitulo.setText(dataProvider.getPerfil_subtitulo());
        handler.avaliacao.setText(dataProvider.getPerfil_avaliação());

        return row;
    }

}