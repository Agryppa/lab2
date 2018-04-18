package com.example.herud.lab2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.support.v7.widget.AppCompatTextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataIn extends AppCompatActivity {

    EditText name;
    EditText lName;
    EditText bDate;



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                Intent in=new Intent();
                name=findViewById(R.id.editText);
                lName=findViewById(R.id.editText2);
                bDate=findViewById(R.id.editText3);
                String newName=name.getText().toString();
                String newLName=lName.getText().toString();

               String newDate=bDate.getText().toString();



                in.putExtra("name", newName);
                in.putExtra("lastname", newLName);
                in.putExtra("date", newDate);

                setResult(Activity.RESULT_OK, in);
                this.finish();
                //startActivity(in);
                break;

            default:
                break;
        }
        return true;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.inputmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_in);


    }
}
