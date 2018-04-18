package com.example.herud.lab2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Herud on 2018-04-11.
 */


public class ListFragment extends Fragment
{
    private MyArrayAdapter adapter;
    private ArrayList<Person> arrL;


    void fillArrL(Integer position)
    {
        arrL=new ArrayList<>();
        if(position==0)
        {
            arrL.add(new Person("Sean", "Bean",R.drawable.smaug));
            arrL.add(new Person("Ian", "McKellen",R.drawable.hugo));
            arrL.add(new Person("Viggo", "Mortensen",R.drawable.hugo));
        }
        else if(position==1)
        {
            arrL.add(new Person("Martin", "Freeman",R.drawable.hobbiy));
            arrL.add(new Person("Orlando", "Bloom",R.drawable.lotr));
            arrL.add(new Person("John", "Hurt",R.drawable.hugo));
        }
        else if(position==2)
        {
            arrL.add(new Person("Hugo", "Weawing",R.drawable.aragorn));
            arrL.add(new Person("Natalie", "Portman",R.drawable.hugo));
            arrL.add(new Person("Ian", "McKellen",R.drawable.smaug));
        }
        else if(position==3)
        {
            arrL.add(new Person("Marlon", "Brando",R.drawable.smaug));
            arrL.add(new Person("Al", "Pacino",R.drawable.lotr));
            arrL.add(new Person("Diane", "Keaton",R.drawable.hugo));
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater
                .inflate(R.layout.activity_main, container, false);
        ListView lv = (ListView)view.findViewById(R.id.lv);

        Integer position= getActivity().getIntent().getIntExtra(FragmentParentActivity.intentKey,0);
        fillArrL(position);
        adapter=new MyArrayAdapter(this.getActivity(), arrL);
        lv.setAdapter(adapter);



        return view;
    }


}
