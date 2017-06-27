package com.example.kennedy.miloo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class FiltrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);
    }


    public void onToggleClickedMaisRelevantes ( View view)
    {
        boolean checked = ((ToggleButton)view).isChecked();
        if(checked)
        {

        }
        else
        {

        }
    }
}
