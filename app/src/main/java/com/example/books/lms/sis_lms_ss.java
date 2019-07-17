package com.example.books.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sis_lms_ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sis_lms_ss);
    }

    public void ss_click(View view) {

    }

    public void lms_click(View view) {
        Intent intent=new Intent(getApplicationContext(),log_in.class);
        startActivity(intent);
    }

    public void sis_click(View view) {
    }
}
