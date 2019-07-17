package com.example.books.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.books.lms.Utilities.ConstantsPref;

public class administrating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrating);
    }

    public void chang_pass(View view) {
        Intent intent=new Intent(getApplicationContext(),chang_pass.class);
        startActivity(intent);
    }
    public void edit_profile(View view) {
        Intent intent= new Intent(getApplicationContext(),edit_profile.class);
        startActivity(intent);
    }

    public void btn_logout(View view) {
        ConstantsPref.removeUser(this);
        Intent intent= new Intent(getApplicationContext(),log_in.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
