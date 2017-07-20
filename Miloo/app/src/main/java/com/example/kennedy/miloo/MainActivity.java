package com.example.kennedy.miloo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.kennedy.miloo.domain.Bag;
import com.example.kennedy.miloo.fragments.BagFragment;
import com.example.kennedy.miloo.libs.BagMainFragment;
import com.example.kennedy.miloo.libs.BottomNavigationViewHelper;
import com.example.kennedy.miloo.libs.NotificacoesMainFragment;
import com.example.kennedy.miloo.libs.PessoaMainFragment;
import com.example.kennedy.miloo.libs.ProcuraMainFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_bag:
//                    BagFragment frag = (BagFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
//                    if(frag == null) {
//                        frag = new BagFragment();
//                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                        ft.replace(R.id.contentLayout, frag, "mainFrag");
//                        ft.commit();
//                    }
                    BagMainFragment bagMainFragment = new BagMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, bagMainFragment, bagMainFragment.getTag()).commit();
                    return true;
                case R.id.navigation_notificacoes:
                    NotificacoesMainFragment notificacoesMainFragment = new NotificacoesMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, notificacoesMainFragment, notificacoesMainFragment.getTag()).commit();
                    return true;
                case R.id.navigation_pesquisa:
                    ProcuraMainFragment procuraMainFragment = new ProcuraMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, procuraMainFragment, procuraMainFragment.getTag()).commit();
                    return true;
                case R.id.navigation_pessoa:
                    PessoaMainFragment pessoaMainFragment = new PessoaMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, pessoaMainFragment, pessoaMainFragment.getTag()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.disableShiftMode(navigation);
    }


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
