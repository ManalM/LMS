package com.example.books.lms;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.Locale;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class log_in extends AppCompatActivity {

    public static final String PREFS_NAME = "mypre";
    public static final String PREF_USERNAME = "username";
    public static final String PREF_PASSWORD = "password";
    private static final String PREF_CHECK = "checked";
    SharedPreferences prefs;
    private EditText edtEmail, edtPassword;
    private TextView txt;
    private CheckBox remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        txt = findViewById(R.id.txtError);
        txt.setText("");
        edtEmail = findViewById(R.id.edit_username);
        edtPassword = findViewById(R.id.edit_password);
        remember = findViewById(R.id.remember);


        prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        MyDb.getInstance(this).initDB();

        retrieveData();

        User user = ConstantsPref.getUser(this);
        if (user != null) {
            Intent intent = new Intent(getApplicationContext(), administrating.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
    }

    private void retrieveData() {
        SharedPreferences sp = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        if (sp.contains(PREF_USERNAME)) {
            String name = sp.getString(PREF_USERNAME, "not found");
            edtEmail.setText(name.toString());
        }
        if (sp.contains(PREF_PASSWORD)) {
            String pass = sp.getString(PREF_PASSWORD, "not found");
            edtPassword.setText(pass.toString());
        }
        if (sp.contains(PREF_CHECK)) {
            Boolean b = sp.getBoolean(PREF_CHECK, false);
            remember.setChecked(b);

        }
    }

    public void log_in_click(View view) {
        if (!isValid())
            return;

        if (remember.isChecked()) {
            Boolean saveLogin = remember.isChecked();
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString(PREF_USERNAME, edtEmail.getText().toString());
            editor.putString(PREF_PASSWORD, edtPassword.getText().toString());
            editor.putBoolean(PREF_CHECK, saveLogin);
            editor.commit();
        } else {

            prefs.edit()
                    .clear()
                    .apply();
        }

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


    public void click_forget(View view) {
        Intent intent = new Intent(getApplicationContext(), forget_password.class);
        startActivity(intent);
    }

    private boolean isValid() {
        if (edtEmail.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty()) {
            txt.setText("please, fill all Fields!");
            return false;
        }

        User user = MyDb.getInstance(this)
                .getUser(edtEmail.getText().toString(), edtPassword.getText().toString());

        if (user == null || !user.getJob().equals("student")) {
            txt.setText("Email or Password is wrong!!");
            return false;
        }

        ConstantsPref.setUser(this, user);

        return true;
    }


}
