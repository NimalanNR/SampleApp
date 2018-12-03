package com.example.h282773.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddRoom extends AppCompatActivity {


    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
        spinner = findViewById(R.id.spinner_selectroom);

        List<String> roomType = new ArrayList<String>();
        roomType.add(0,"Select Room Type");
        roomType.add("Single Bed Room");
        roomType.add("Double Bed Room");
        roomType.add("Waiting Hall");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,roomType);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
        spinner.setAdapter(dataAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(parent.getItemAtPosition(position).equals("Select Room Type"))
                {

                }
                else
                {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected Item:"+item,Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}


