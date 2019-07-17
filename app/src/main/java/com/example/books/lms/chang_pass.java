package com.example.books.lms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

public class chang_pass extends AppCompatActivity {
    private User user;
    private EditText pass1, pass2;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chang_pass);

        user = ConstantsPref.getUser(this);
        pass1 = findViewById(R.id.edit_new_pass);
        pass2 = findViewById(R.id.edit_pass_again);
        txt = findViewById(R.id.txtError);
    }

    public void btn_save(View view) {

        if(isValid()){
            Toast.makeText(this, "update successfully",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Not update",Toast.LENGTH_SHORT).show();
        }

        if(pass1.getText().toString().isEmpty() || pass2.getText().toString().isEmpty()
                || pass2.getText().toString().equals(pass1.getText().toString()))
            return;
    }

    public void btn_cancel(View view) {
        finish();
    }

    private boolean isValid(){
        if(pass1.getText().toString().isEmpty() || pass2.getText().toString().isEmpty()
                || !pass2.getText().toString().equals(pass1.getText().toString())){
            txt.setText("please, fill all Fields!");
            return false;
        }

        user.setPassword(pass2.getText().toString());
        ConstantsPref.setUser(this, user);
        return MyDb.getInstance(this).updateUser(user);
    }
}
