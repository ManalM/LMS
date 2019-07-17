package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class ForumAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        String name = getIntent().getStringExtra("name");

        List<String> strings = new ArrayList<>();
        TextView txt = findViewById(R.id.txtForum);

        if(name.equals("post")){
            strings.add("Pythonic Operators on STL Set Algorithms");
            strings.add("Coding for Windows 10 If You Don't Have Windows 10");
            strings.add("Considerations when Implementing an Information Management System");
            strings.add("Pythonic Operators on STL Set Algorithms");
            strings.add("Algorithm to solve a tangram  ");
            strings.add("Writing a program to grade a multiple-choice exam -- College Freshman Level");
            strings.add("Getting Random Numbers From Lists  ");
            strings.add("Easiest way to start python  ");
            strings.add("CSS text properties  ");
            strings.add("Drop-Down Menu.  ");
            txt.setText(getResources().getString(R.string.posts));
        }else {
            strings.add("How to make code run differently depending on the platform it is running on?");
            strings.add("Can't Traverse a Doubly Linked List in Java");
            strings.add("Machine learning vs statistics");
            strings.add("Simple Solutions: Coding C and C++ with Visual Studio Code");
            strings.add("Simple Solutions: Coding C and C++ with Visual Studio Code");
            strings.add("How can I provide my program to wait for getting an input from user?");
            strings.add("how do I print my console output into a GUI Textbox");
            strings.add("I keep getting syntax error?   ");
            strings.add("CSS Arrows  ");
            strings.add("Creating a Slideshow using only Javascript, HTML and CSS part 4");
            txt.setText(getResources().getString(R.string.Dascusiion));
        }

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, strings);

        listView.setAdapter(adapter);
    }
}
