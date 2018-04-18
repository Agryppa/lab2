package com.example.herud.lab2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Herud on 2018-04-12.
 */

public class GridViewFragment extends Fragment
{
    private Integer[] picArray;


    private void fill(Integer position)
    {
        picArray = new Integer[6];
        if(position==0) {

            picArray[0] = R.drawable.godfather;
            picArray[1] = R.drawable.smaug;
            picArray[2] = R.drawable.aragorn;
            picArray[3] = R.drawable.hobbiy;
            picArray[4] = R.drawable.hugo;
            picArray[5]=R.drawable.godfather;
        }else if(position==1)
        {
            picArray[1] = R.drawable.godfather;
            picArray[2] = R.drawable.smaug;
            picArray[3] = R.drawable.aragorn;
            picArray[4] = R.drawable.hobbiy;
            picArray[5] = R.drawable.hugo;
            picArray[0]=R.drawable.godfather;
        }else if(position==2)
        {
        picArray[2] = R.drawable.godfather;
        picArray[3] = R.drawable.smaug;
        picArray[4] = R.drawable.aragorn;
        picArray[5] = R.drawable.hobbiy;
        picArray[0] = R.drawable.hugo;
        picArray[1]=R.drawable.godfather;
        }else if(position==3)
        {
            picArray[3] = R.drawable.godfather;
            picArray[4] = R.drawable.smaug;
            picArray[5] = R.drawable.aragorn;
            picArray[0] = R.drawable.hobbiy;
            picArray[1] = R.drawable.hugo;
            picArray[2]=R.drawable.godfather;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.grid_view_layout, container, false);

        Integer position= getActivity().getIntent().getIntExtra(FragmentParentActivity.intentKey,0);
        fill(position);

        GridView gridview = (GridView) view.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this.getActivity(),picArray));


        return view;
    }



}
