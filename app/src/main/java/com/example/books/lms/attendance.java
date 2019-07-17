package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

public class attendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        User user = ConstantsPref.getUser(this);

        String name = getIntent().getStringExtra("name");

        Log.e("nameee", name + " " + user.getId());
        CourseM courseM = MyDb.getInstance(this).getCourse(user.getId(), name.trim());

        TextView session = findViewById(R.id.textView4);
        TextView precent = findViewById(R.id.textView5);
        TextView excu = findViewById(R.id.textView7);
        TextView absent = findViewById(R.id.textView9);
        TextView attend = findViewById(R.id.textView11);
        TextView attendPerecnt = findViewById(R.id.textView1);

        session.setText(String.valueOf(courseM.getSessionsCompleted()));
        precent.setText(String.valueOf(courseM.getPresent()));
        excu.setText(String.valueOf(courseM.getExcused()));
        absent.setText(String.valueOf(courseM.getAbsent()));
        attend.setText(String.valueOf(courseM.getAttendanceGrade()));
        attendPerecnt.setText(String.valueOf(courseM.getAttendanceGPrecent()));

    }
}
