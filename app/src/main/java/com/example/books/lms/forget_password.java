package com.example.books.lms;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.books.lms.Model.MySQLiteDB;

public class forget_password extends AppCompatActivity {

    private EditText recover_email ;
    private MySQLiteDB mySQLiteDB;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        recover_email = (EditText) findViewById(R.id.edit_email);
        mySQLiteDB= new MySQLiteDB(this);
        txt = findViewById(R.id.error_mail);
        txt.setText("");
    }

    public void send_emil(View view) {

        if (recover_email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please Fill your email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (mySQLiteDB.checkUser(recover_email.getText().toString().trim())) {
            Intent accountsIntent = new Intent(this, ConfirmPassword.class);
            accountsIntent.putExtra("EMAIL", recover_email.getText().toString().trim());
           recover_email.setText("");
            startActivity(accountsIntent);
        } else {
            txt.setText("Invalid Email");
           // Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }
}
