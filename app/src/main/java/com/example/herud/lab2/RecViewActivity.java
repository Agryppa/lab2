package com.example.herud.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class RecViewActivity extends AppCompatActivity {
private final List<Title>ar=new ArrayList<>();
private RecyclerView recyclerView;
private RecAdapter mAdapter;

private void fillArr()
{
    ar.add(new Title(getString(R.string.lotr),R.drawable.lotr,getString(R.string.fantasy),0));
    ar.add(new Title(getString(R.string.hobbit),R.drawable.hobbiy,getString(R.string.fantasy),0));
    ar.add(new Title(getString(R.string.vvendetta),R.drawable.v,getString(R.string.sf),0));
    ar.add(new Title(getString(R.string.TheGodfather), R.drawable.godfather,getString(R.string.drama3),0));


}
    RecyclerViewListener clickListener()
    {
        RecyclerViewListener rvListener=new RecyclerViewListener(getApplicationContext(), recyclerView, new RecyclerViewListener.ClickListener()
        {
            @Override
            public void onClick(View view, int position)
            {
                //int index=recyclerView.indexOfChild(view);
                //String title=recyclerView.get
                FragmentParentActivity.start(RecViewActivity.this,position);
            }

            @Override
            public void onLongClick(View view, int position)
            {

            }
        });

        return rvListener;
    }
    ItemTouchHelper.SimpleCallback itemTouchHelper()
    {
        ItemTouchHelper.SimpleCallback helper=new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN | ItemTouchHelper.UP) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                final int position = viewHolder.getAdapterPosition();

                mAdapter.notifyItemRemoved(position);
                mAdapter.notifyItemRangeChanged(position, mAdapter.getItemCount());
                ar.remove(position);
            }
        };

        return helper;


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rec_view);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        fillArr();

        mAdapter = new RecAdapter(ar);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = itemTouchHelper();
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

        recyclerView.addOnItemTouchListener(clickListener());



    }
}
