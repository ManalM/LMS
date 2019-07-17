package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.books.lms.Model.Forum;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.ArrayList;
import java.util.List;

public class CourseForum extends AppCompatActivity {

    List<Forum> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_forum);

        String name = getIntent().getStringExtra("name");

        list = MyDb.getInstance(this).getCourseForum(name.trim());

        List<String> strings = new ArrayList<>();

        for (Forum corse: list) {
            strings.add(corse.getTitle());
        }

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, strings);

        listView.setAdapter(adapter);
    }
}
