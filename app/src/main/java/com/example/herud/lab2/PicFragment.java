package com.example.herud.lab2;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Herud on 2018-04-10.
 */

public class PicFragment extends Fragment
{
    private ImageView pic1,pic2,pic3,pic4,pic5,pic6;
    void setPictures(Integer position)
    {

        pic1.setImageResource(R.drawable.hobbiy);
        pic2.setImageResource(R.drawable.hobbiy);
        pic3.setImageResource(R.drawable.hobbiy);
        pic4.setImageResource(R.drawable.hobbiy);
        pic5.setImageResource(R.drawable.hobbiy);
        pic6.setImageResource(R.drawable.hobbiy);




    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.pic_frag_layout, container, false);
        pic1=(ImageView)view.findViewById(R.id.pic1);
        pic2=(ImageView)view.findViewById(R.id.pic2);
        pic3=(ImageView)view.findViewById(R.id.pic3);
        pic4=(ImageView)view.findViewById(R.id.pic4);
        pic5=(ImageView)view.findViewById(R.id.pic5);
        pic6=(ImageView)view.findViewById(R.id.pic6);
        Integer position= getActivity().getIntent().getIntExtra("key",0);
        setPictures(position);

        return view;
    }



}



