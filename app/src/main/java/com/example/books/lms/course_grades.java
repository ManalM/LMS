package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

public class course_grades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_grades);

        User user = ConstantsPref.getUser(this);

        String name = getIntent().getStringExtra("name");

        Log.e("nameee", name + " " + user.getId());
        CourseM courseM = MyDb.getInstance(this).getCourse(user.getId(), name.trim());

        Button btnMta = findViewById(R.id.btn_mta);
        Button btnTma = findViewById(R.id.btn_tma);

        btnMta.setText("MTA Grades "+ courseM.getMta() + " / 10");
        btnTma.setText("MTA Grades "+ courseM.getTma() + " / 10");
    }
}
