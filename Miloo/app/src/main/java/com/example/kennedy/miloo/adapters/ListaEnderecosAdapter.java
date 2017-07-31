package com.example.kennedy.miloo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.domain.ListaEnderecos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felipe on 30/07/2017.
 */

public class ListaEnderecosAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public ListaEnderecosAdapter(Context context, int resource) {
        super(context, resource);
    }

    static  class  DataHandler{
        ImageView imagem;
        TextView titulo;
        TextView subtitulo;
        TextView cidade;
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
            row = inflater.inflate(R.layout.fragment_lista_enderecos_item, parent, false);
            handler = new DataHandler();
            handler.titulo = (TextView) row.findViewById(R.id.textView_titulo_lista_endereco);
            handler.subtitulo = (TextView) row.findViewById(R.id.textView_subtitulo_lista_endereco);
            handler.cidade = (TextView) row.findViewById(R.id.textView_cidade_lista_endereco);
            handler.imagem = (ImageView) row.findViewById(R.id.imageViewPin);
            row.setTag(handler);
        }
        else {
            handler = (DataHandler) row.getTag();
        }
        ListaEnderecos dataProvider;
        dataProvider = (ListaEnderecos)this.getItem(position);
        handler.imagem.setImageResource(dataProvider.getLista_endereco_img());
        handler.titulo.setText(dataProvider.getLista_endereco_titulo());
        handler.subtitulo.setText(dataProvider.getLista_endereco_subtitulo());
        handler.cidade.setText(dataProvider.getLista_endereco_cidade());

        return row;
    }
}
