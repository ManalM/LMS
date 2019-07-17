package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class contact extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView explistview;
    List<String>listdataheader;
    HashMap<String,List<imageitem>>listdatachild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
       /* listdataheader=new ArrayList<>();
        listdatachild=new HashMap<String, List<imageitem>>();

        listdataheader.add("main");
        listdataheader.add(" sub main");
        listdataheader.add("can");

        List<imageitem>main=new ArrayList<>();
        main.add(new imageitem("ali",R.drawable.change)) ;
        main.add(new imageitem("naser",R.drawable.change));
        main.add(new imageitem("aleb",R.drawable.change));

        List<imageitem>submain=new ArrayList<>();
        submain.add(new imageitem("ali",R.drawable.change)) ;
        submain.add(new imageitem("naser",R.drawable.change));
        submain.add(new imageitem("aleb",R.drawable.change));

        listdatachild.put(listdataheader.get(0),main);
        listdatachild.put(listdataheader.get(1),submain);
        explistview=(ExpandableListView)findViewById(R.id.explist);
        listAdapter=new ExpandableListAdapter(this,listdataheader,listdatachild);
        explistview.setAdapter(listAdapter);*/

    }
}
