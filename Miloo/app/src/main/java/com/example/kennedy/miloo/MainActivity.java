package com.example.kennedy.miloo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.kennedy.miloo.libs.BagMainFragment;
import com.example.kennedy.miloo.libs.NotificacoesMainFragment;
import com.example.kennedy.miloo.libs.PessoaMainFragment;
import com.example.kennedy.miloo.libs.ProcuraMainFragment;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_bag:
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
    }

}
