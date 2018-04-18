package com.example.herud.lab2;


import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentParentActivity extends AppCompatActivity {

    private TextView title;
    private ImageView image;
    private boolean fragmentFlag=false;
    public static final String intentKey="key";

    public static void start(Context context,Integer position) {
        Intent starter = new Intent(context, FragmentParentActivity.class);
        starter.putExtra(intentKey,position);
        context.startActivity(starter);
    }

    private String chooseTitle(Integer position)
    {
        if(position==0)
            return "Lord of the Rings";
        else if(position==1)
            return "The Hobbit";
        else if(position==2)
            return "V for Vendetta";
        else if(position==3)
            return "The Godfather";
        return "error";
    }
    private int choosePic(Integer position)
    {
        if(position==0)
            return R.drawable.lotr;
        else if(position==1)
            return R.drawable.hobbiy;
        else if(position==2)
            return R.drawable.v;
        else if(position==3)
            return R.drawable.godfather;
    else return R.drawable.gradient;
    }

    private void changeFragment()
    {
        Fragment fragment;
        if(fragmentFlag)
        {
            fragment = new ListFragment();
        }else
        {
            fragment = new GridViewFragment();

        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentHolder, fragment);
        transaction.commit();
        fragmentFlag=!fragmentFlag;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_parent);

        title=(TextView)findViewById(R.id.faTitle);
        image=(ImageButton)findViewById(R.id.faImage);

        Integer position=this.getIntent().getIntExtra(intentKey,1);

        title.setText(chooseTitle(position));
        image.setImageResource(choosePic(position));
        changeFragment();
        fragmentFlag=true;

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment();
            }
        });



    }
}
