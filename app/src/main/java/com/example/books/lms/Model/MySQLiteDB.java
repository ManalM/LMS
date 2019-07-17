package com.example.books.lms.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Farouk muharram on 1/14/2019.
 */

public class MySQLiteDB extends SQLiteOpenHelper {


    //region init
    private static final String DATABASE_NAME = "lms.db";
    private static final int DATABASE_VERSION = 1;
    // endregion


    public MySQLiteDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLiteModel.Users.SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.Courses.SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.User_Course.SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.Forum.SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.CourseContent.SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQLiteModel.Users.SQL_DELETE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.Courses.SQL_DELETE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.User_Course.SQL_DELETE_ENTRIES);
        sqLiteDatabase.execSQL(SQLiteModel.Forum.SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
            db.execSQL("PRAGMA foreign_keys='ON';");
        }
    }

    public void updatePassword(String email, String pass) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(SQLiteModel.Table.password, pass);
        db.update(SQLiteModel.Table.TABLE_Users, cv, SQLiteModel.Table.email+" = ?",new String[] { email });
        db.close();
    }

    public boolean checkUser(String mail) {

        String[] columns = {
                SQLiteModel.Table.userId
        };

        SQLiteDatabase db = this.getWritableDatabase();
        String selection = SQLiteModel.Table.email + " = ?";

        String[] selectionArgs = {mail};
        Cursor cursor = db.query(SQLiteModel.Table.TABLE_Users,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {
            return true;
        }


        return false;
    }
}
