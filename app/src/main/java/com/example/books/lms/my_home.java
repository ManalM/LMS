package com.example.books.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class my_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home);
    }

    public void click_time_in(View view) {
        Intent intent=new Intent(getApplicationContext(), time_in_aou.class);
        startActivity(intent);
    }

    public void btn_library(View view) {
        Intent intent=new Intent(getApplicationContext(), Library.class);
        startActivity(intent);
    }

    public void btn_courses(View view) {
        Intent intent=new Intent(getApplicationContext(), AllCourses.class);
        startActivity(intent);
    }
}
