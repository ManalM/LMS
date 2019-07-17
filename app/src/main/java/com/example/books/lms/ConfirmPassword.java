package com.example.books.lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.books.lms.Model.MySQLiteDB;

public class ConfirmPassword extends AppCompatActivity {

    private EditText newPass , confirmNewPass;

    private MySQLiteDB mySQLiteDB;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_password);
        newPass = findViewById(R.id.new_pass);
        confirmNewPass = findViewById(R.id.confirm_new_pass);
        mySQLiteDB = new MySQLiteDB(this);
        Intent intent = getIntent();
        email = intent.getStringExtra("EMAIL");
    }


    public void new_pass(View view) {

        String value = newPass.getText().toString().trim();
        String value1 = confirmNewPass.getText().toString().trim();
        if (value.isEmpty()  && value1.isEmpty()) {
            Toast.makeText(this, "Please Fill your new password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!value.equals(value1)){
            Toast.makeText(this, "Please Fill your new password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!mySQLiteDB.checkUser(email)){

            Toast.makeText(this, "email doesn't exist ", Toast.LENGTH_SHORT).show();

        }else {

            mySQLiteDB.updatePassword(email,value1);
            Toast.makeText(this, "Password updated successful", Toast.LENGTH_SHORT).show();
            newPass.setText("");
            confirmNewPass.setText("");

            Intent intent = new Intent(this, log_in.class);
            startActivity(intent);
            finish();

        }


    }
}
