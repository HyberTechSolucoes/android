package com.example.kennedy.miloo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.kennedy.miloo.domain.CardCategoria;
import com.example.kennedy.miloo.fragments.CardCategoriaFragment;
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
                case R.id.navigation_pesquisa:
                    ProcuraMainFragment procuraMainFragment = new ProcuraMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, procuraMainFragment, procuraMainFragment.getTag()).commit();
                    return true;
                case R.id.navigation_bag:
                    NotificacoesMainFragment notificacoesMainFragment2 = new NotificacoesMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, notificacoesMainFragment2, notificacoesMainFragment2.getTag()).commit();
                    return true;
                case R.id.navigation_notificacoes:
                    NotificacoesMainFragment notificacoesMainFragment = new NotificacoesMainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, notificacoesMainFragment, notificacoesMainFragment.getTag()).commit();
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

        ProcuraMainFragment procuraMainFragment = new ProcuraMainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contentLayout, procuraMainFragment, procuraMainFragment.getTag()).commit();


    }


    public List<CardCategoria> getSetCarList(int qtd){
        String[] models = new String[]{"Gallardo", "Vyron", "Corvette", "Pagani Zonda", "Porsche 911 Carrera", "BMW 720i", "DB77", "Mustang", "Camaro", "CT6"};
        String[] brands = new String[]{"Lamborghini", " bugatti", "Chevrolet", "Pagani", "Porsche", "BMW", "Aston Martin", "Ford", "Chevrolet", "Cadillac"};
        int[] photos = new int[]{R.drawable.bag_icon, R.drawable.bell_icon, R.drawable.busca_icon1x, R.drawable.person_icon, R.drawable.bag_icon, R.drawable.busca_icon1x, R.drawable.person_icon, R.drawable.daenerys_03x, R.drawable.daenerys_03x, R.drawable.person_icon};
        List<CardCategoria> listAux = new ArrayList<>();

        for(int i = 0; i < qtd; i++){
            CardCategoria c = new CardCategoria( models[i % models.length], brands[ i % brands.length ], photos[i % models.length] );
            listAux.add(c);
        }
        return(listAux);
    }

}
