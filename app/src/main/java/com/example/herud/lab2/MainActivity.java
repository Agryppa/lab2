package com.example.herud.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;


//not really the main activity anymore

public class MainActivity extends AppCompatActivity {


    Person newGuy=null;
    MyArrayAdapter adapter;
    ArrayList<Person> arrL;

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) { // Activity.RESULT_OK
                //Bundle extras = getIntent().getExtras();
                String aName = (String)data.getStringExtra("name");
                String aLastName = (String)data.getStringExtra("lastname");
                //String aDate = (String) data.getStringExtra("date");



                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                /*Date newDate= null;
                try {
                    newDate = sdf.parse(aDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                newGuy=new Person(aName, aLastName);//, newDate);
                arrL.add(newGuy);
                adapter.notifyDataSetChanged();

            }
        }

    }*/





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.listmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.newperson:
                Intent i3=new Intent(MainActivity.this, dataIn.class);
                startActivityForResult(i3, 0);
                break;

            default:
                break;
        }
        return true;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView lv = findViewById(R.id.lv);

        Person p=new Person("Piotr", "Herud", new Date(97,11,12));
        arrL=new ArrayList<>();

        arrL.add(p);

        if(newGuy!=null)
            arrL.add(newGuy);

        adapter=new MyArrayAdapter(this, arrL);
        lv.setAdapter(adapter);




    }




}







