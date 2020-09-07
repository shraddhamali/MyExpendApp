package com.shraddha.myexpendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    MyExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=findViewById(R.id.idexp);

        //Prepering list data
        prepareListData();
        listAdapter=new MyExpandableListAdapter(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(listAdapter);
    }

    private void prepareListData() {

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        //Adding Header data;
        listDataHeader.add("Topics");
        listDataHeader.add("Topics Covered");
        listDataHeader.add("Topics Not Covered");

        //Adding child data;
        List<String> top250= new ArrayList<>();
        top250.add("Android");
        top250.add("Android Arch..");
        top250.add("Android SDK");
        top250.add("Android UI");
        top250.add("Android Notificaion");
        top250.add("Android Maps");
        top250.add("Android Bluetooth");
        top250.add("Android WIFI");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Android");
        nowShowing.add("Android Arch..");
        nowShowing.add("Android SDK");
        nowShowing.add("Android UI");
        nowShowing.add("Android Notificaion");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("Android Maps");
        comingSoon.add("Android Bluetooth");
        comingSoon.add("Android WIFI");

        listDataChild.put(listDataHeader.get(0),top250);
        listDataChild.put(listDataHeader.get(1),nowShowing);
        listDataChild.put(listDataHeader.get(2),comingSoon);



    }
}