package com.example.herud.lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Herud on 2018-04-12.
 */

public class ImageAdapter extends BaseAdapter
{
    private Context mContext;
    private Integer[] picArr;
    public ImageAdapter(Context c,Integer[]picArr) {
        mContext = c;
        this.picArr=picArr;
    }

    public int getCount() {
        return picArr.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = inflater.inflate(R.layout.grid_element, null);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);

            imageView.setImageResource(picArr[position]);


        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }



}





