package com.example.kennedy.miloo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.adapters.PerfilAdapter;
import com.example.kennedy.miloo.domain.Perfil;

/**
 * Created by Felipe on 07/08/2017.
 */

public class PerfilAvaliacaoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_perfil_item_aval, container, false);
        ListView listView = (ListView)  rootView.findViewById(R.id.list_view_perfil_avaliacao);
        String[] titulos = getResources().getStringArray(R.array.lista_titulo);
        String[] subtitulos = getResources().getStringArray(R.array.lista_subtitulo);
        String[] avaliacoes = getResources().getStringArray(R.array.lista_extra);

        int i = 0;
        PerfilAdapter adapter = new PerfilAdapter(this.getActivity(), R.layout.fragment_perfil_item_aval);
        listView.setAdapter(adapter);
        for (String titulo : titulos) {
            Perfil dataProvider = new Perfil(R.drawable.pin_icon, titulo, subtitulos[i], avaliacoes[i]);
            adapter.add(dataProvider);
            i++;
        }
        return  rootView;
    }
}
