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

public class edit_profile extends AppCompatActivity {

    private EditText edtName, edtCountry, edtTown, edtPhone;
    private TextView txt;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        user = ConstantsPref.getUser(this);

        if(user == null){
            finish();
            return;
        }

        txt = findViewById(R.id.txtError);
        edtName = findViewById(R.id.edtName);
        edtCountry = findViewById(R.id.edtCountry);
        edtTown = findViewById(R.id.edtTown);
        edtPhone = findViewById(R.id.edtPhone);

        edtName.setText(user.getName());
        edtCountry.setText(user.getCountry());
        edtTown.setText(user.getTown());
        edtPhone.setText(user.getPhone());

    }

    public void click_save(View view) {

        if(isValid()){
            Toast.makeText(this, "update successfully",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Not update",Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isValid(){
        if(edtName.getText().toString().isEmpty() || edtCountry.getText().toString().isEmpty()
                || edtTown.getText().toString().isEmpty() || edtPhone.getText().toString().isEmpty()){
            txt.setText("please, fill all Fields!");
            return false;
        }

        user.setName(edtName.getText().toString());
        user.setCountry(edtCountry.getText().toString());
        user.setTown(edtTown.getText().toString());
        user.setPhone(edtPhone.getText().toString());
        ConstantsPref.setUser(this, user);
        return MyDb.getInstance(this).updateUser(user);
    }

    public void click_cancel(View view) {
        finish();
    }
}
