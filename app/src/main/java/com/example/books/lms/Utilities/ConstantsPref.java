package com.example.books.lms.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.books.lms.Model.User;

public class ConstantsPref {

    //share preferences
    public  static  final String PREF_USER = "pref_user";
    public  static  final String MESSAGE_COUNT = "pref_message_count";

    // region methods

    public static User getUser(Context context){
        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER
                , Context.MODE_PRIVATE);
        User user = new User();

        user.setId(sharedPreferences.getInt("id", 0));
        user.setEmail(sharedPreferences.getString("email", null));
        user.setPassword(sharedPreferences.getString("password", null));
        user.setName(sharedPreferences.getString("name", null));
        user.setStudentId(sharedPreferences.getString("getStudentId", null));
        user.setImg(sharedPreferences.getString("img", null));
        user.setCountry(sharedPreferences.getString("country", null));
        user.setTown(sharedPreferences.getString("town", null));
        user.setCourse(sharedPreferences.getString("course", null));
        user.setJob(sharedPreferences.getString("job", null));
        user.setOfficeHours(sharedPreferences.getString("officeHours", null));
        user.setPhone(sharedPreferences.getString("phone", null));
        user.setFirstAccess(sharedPreferences.getString("firstAccess", null));
        user.setLastAccess(sharedPreferences.getString("lastAccess", null));
        user.setRemember(sharedPreferences.getBoolean("isRemember", false));

        if(user.getId() <= 0 )
            return null;

        return user;
    }

    public static void setUser(Context context, User user){

        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("id", user.getId())
                .putString("email", user.getEmail())
                .putString("password", user.getPassword())
                .putString("name", user.getName())
                .putString("getStudentId", user.getStudentId())
                .putString("img", user.getImg())
                .putString("country", user.getCountry())
                .putString("town", user.getTown())
                .putString("course", user.getCourse())
                .putString("job", user.getJob())
                .putString("officeHours", user.getOfficeHours())
                .putString("phone", user.getPhone())
                .putString("firstAccess", user.getFirstAccess())
                .putString("lastAccess", user.getLastAccess())
                .putBoolean("isRemember", user.isRemember())
                .apply();
    }
    
    public static void removeUser(Context context){
        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_USER, Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().apply();
    }

    //endregion
}
