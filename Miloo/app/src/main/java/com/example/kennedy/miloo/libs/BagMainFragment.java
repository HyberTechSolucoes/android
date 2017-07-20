package com.example.kennedy.miloo.libs;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.kennedy.miloo.MainActivity;
import com.example.kennedy.miloo.R;
import com.example.kennedy.miloo.adapters.BagAdapter;
import com.example.kennedy.miloo.domain.Bag;
import com.example.kennedy.miloo.fragments.BagFragment;
import com.example.kennedy.miloo.interfaces.RecyclerViewOnClickListenerHack;


import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BagMainFragment  extends Fragment  {

    private RecyclerView mRecyclerView;
    private List<Bag> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bag_main, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);



        mList = ((MainActivity) getActivity()).getSetProfList(3);
        BagAdapter adapter = new BagAdapter(getActivity(), mList);
        mRecyclerView.setAdapter( adapter );


        return view;
    }


//implements RecyclerViewOnClickListenerHack
//    private RecyclerView mRecyclerView;
//    private List<Bag> mList;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater,
//                             ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_bag_main, container, false);
//
//        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
//        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//
//                LinearLayoutManager llm = (LinearLayoutManager) mRecyclerView.getLayoutManager();
//
//
//                BagAdapter adapter = (BagAdapter) mRecyclerView.getAdapter();
//
//                if (mList.size() == llm.findLastCompletelyVisibleItemPosition() + 1) {
//                    List<Bag> listAux = ((MainActivity) getActivity()).getSetProfList(3);
//
//                    for (int i = 0; i < listAux.size(); i++) {
//                        adapter.addListItem(listAux.get(i), mList.size());
//                    }
//                }
//            }
//        });
//        mRecyclerView.addOnItemTouchListener(new BagFragment.RecyclerViewTouchListener( getActivity(), mRecyclerView, this ));
//
//        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
//        llm.setOrientation(LinearLayoutManager.VERTICAL);
//        mRecyclerView.setLayoutManager(llm);
//
//
//
//        mList = ((MainActivity) getActivity()).getSetProfList(3);
//        BagAdapter adapter = new BagAdapter(getActivity(), mList);
//        mRecyclerView.setAdapter( adapter );
//
//
//        return view;
//    }
//
//    @Override
//    public void onClickListener(View view, int position) {
//        Toast.makeText(getActivity(), "onClickListener(): "+position, Toast.LENGTH_SHORT).show();
//    }
//    @Override
//    public void onLongPressClickListener(View view, int position) {
//        Toast.makeText(getActivity(), "onLongPressClickListener(): "+position, Toast.LENGTH_SHORT).show();
//    }
//
//
//    private static class RecyclerViewTouchListener implements RecyclerView.OnItemTouchListener {
//        private Context mContext;
//        private GestureDetector mGestureDetector;
//        private RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;
//
//        public RecyclerViewTouchListener(Context c, final RecyclerView rv, RecyclerViewOnClickListenerHack rvoclh){
//            mContext = c;
//            mRecyclerViewOnClickListenerHack = rvoclh;
//
//            mGestureDetector = new GestureDetector(mContext, new GestureDetector.SimpleOnGestureListener(){
//                @Override
//                public void onLongPress(MotionEvent e) {
//                    super.onLongPress(e);
//
//                    View cv = rv.findChildViewUnder(e.getX(), e.getY());
//
//                    if(cv != null && mRecyclerViewOnClickListenerHack != null){
//                        mRecyclerViewOnClickListenerHack.onLongPressClickListener(cv,
//                                rv.getChildPosition(cv) );
//                    }
//                }
//
//                @Override
//                public boolean onSingleTapUp(MotionEvent e) {
//                    View cv = rv.findChildViewUnder(e.getX(), e.getY());
//
//                    if(cv != null && mRecyclerViewOnClickListenerHack != null){
//                        mRecyclerViewOnClickListenerHack.onClickListener(cv,
//                                rv.getChildPosition(cv) );
//                    }
//
//                    return(true);
//                }
//            });
//        }
//
//        @Override
//        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//            mGestureDetector.onTouchEvent(e);
//            return false;
//        }
//
//        @Override
//        public void onTouchEvent(RecyclerView rv, MotionEvent e) {}
//
//        @Override
//        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//        }
//    }

}
