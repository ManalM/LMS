package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

public class course_coordinator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_coordinator);

        String name = getIntent().getStringExtra("name");

        Log.e("nameee", name );
        User user = MyDb.getInstance(this).getCoordinator(name.trim());

        TextView txtNam = findViewById(R.id.txtNam);
        TextView txtDesc = findViewById(R.id.txtDesc);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtHours = findViewById(R.id.txtHours);
        TextView txtPhone = findViewById(R.id.txtPhone);

        txtNam.setText(String.valueOf(user.getName()));
        txtDesc.setText(String.valueOf(user.getJob()));
        txtEmail.setText(String.valueOf(user.getEmail()));
        txtHours.setText(String.valueOf(user.getOfficeHours()));
        txtPhone.setText(String.valueOf(user.getPhone()));
    }
}
