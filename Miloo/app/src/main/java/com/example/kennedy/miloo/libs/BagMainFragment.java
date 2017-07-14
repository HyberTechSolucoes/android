package com.example.kennedy.miloo.libs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.domain.Bag;
import com.example.kennedy.miloo.fragments.BagFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BagMainFragment extends ActionBarActivity {


    public BagMainFragment() {
        // Required empty public constructor
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_bag_main, container, false);
//    }



    public List<Bag> getSetProfList(int qtd){
        String[] nomeBag = new String[]{"Daenerys Informárica", "Daenerys Cabelereira", "Daenerys Manutenção"};
        int[] backGround = new int[]{R.drawable.informatica_cover, R.drawable.cabelereiro_cover, R.drawable.informatica_cover};
        List<Bag> listAux = new ArrayList<>();

        for(int i = 0; i < qtd; i++){
            Bag c = new Bag( nomeBag[i % nomeBag.length], backGround[i % backGround.length] );
            listAux.add(c);
        }
        return(listAux);
    }
}
