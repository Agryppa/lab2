package com.example.herud.lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Herud on 2018-03-15.
 */

public class MyArrayAdapter extends ArrayAdapter {
    private ArrayList people;

    public MyArrayAdapter(Context context, ArrayList<Person> people) {

        super(context, 0, people);
        this.people=people;
    }


    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int pos) {
        return people.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Person person = (Person)getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_element, parent, false);
        }






        TextView nameT = (TextView) convertView.findViewById(R.id.name);
        TextView lastNameT = (TextView) convertView.findViewById(R.id.lastName);
        ImageView picture =(ImageView)convertView.findViewById(R.id.personPicture) ;



        nameT.setText(person.getName());
        lastNameT.setText(person.getLastName());
        picture.setImageResource(person.getPicture());



        return convertView;
    }




}

