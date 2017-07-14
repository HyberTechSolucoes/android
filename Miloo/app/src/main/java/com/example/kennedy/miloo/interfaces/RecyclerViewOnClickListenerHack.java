package com.example.kennedy.miloo.interfaces;

import android.view.View;

/**
 * Created by Felipe on 12/07/2017.
 */

public interface RecyclerViewOnClickListenerHack {
    public abstract void onClickListener(View view, int position);
    public void onLongPressClickListener(View view, int position);
}
