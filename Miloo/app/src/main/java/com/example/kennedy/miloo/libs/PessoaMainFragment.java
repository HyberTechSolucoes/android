package com.example.kennedy.miloo.libs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kennedy.miloo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PessoaMainFragment extends Fragment {


    public PessoaMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pessoa_main, container, false);
    }

}
