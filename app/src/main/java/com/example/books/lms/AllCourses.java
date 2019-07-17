package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.Forum;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AllCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_courses);

        List<CourseM> list ;
        TextView txt = findViewById(R.id.txt);

        String name = getIntent().getStringExtra("name");
        if(name != null){
            list = MyDb.getInstance(this).getCourses(name);
            txt.setText("Search for " + name);

        }else{
             list = MyDb.getInstance(this).getAllCourses();
        }

        if(list == null || list.size() < 1){
            txt.setText("Search for " + name + " not found");
            return;
        }
        List<String> strings = new ArrayList<>();

        for (CourseM corse: list) {
            strings.add(corse.getCourseCode() + " "+ corse.getName());
        }

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, strings);

        listView.setAdapter(adapter);
    }
}
