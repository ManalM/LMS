package com.example.books.lms.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyDb {

    //region fields
    private static MyDb instance;
    private MySQLiteDB mySQLiteDB;
    private static Context mContext;
    //endregion

    //region init
    public static synchronized MyDb getInstance(Context context) {
        if (instance == null) {
            instance = new MyDb(context);
        }
        return instance;
    }

    private MyDb(Context context) {

        mContext = context;
        this.mySQLiteDB = getMySQLiteDB();
    }

    private MySQLiteDB getMySQLiteDB() {
        if (this.mySQLiteDB == null) {
            this.mySQLiteDB = new MySQLiteDB(mContext.getApplicationContext());
        }

        return mySQLiteDB;
    }
    //endregion

    public void initDB(){
        SQLiteDatabase db = mySQLiteDB.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 1);
        contentValues.put(SQLiteModel.Table.email, "a@a.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "121212877");
        contentValues.put(SQLiteModel.Table.name, "muhammed abdulazeez");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "riyadh");
        contentValues.put(SQLiteModel.Table.img, ".");
        contentValues.put(SQLiteModel.Table.job, "student");
        contentValues.put(SQLiteModel.Table.officeHours, ".");
        contentValues.put(SQLiteModel.Table.phone, "5087464656");
        contentValues.put(SQLiteModel.Table.firstAccess, "0");
        contentValues.put(SQLiteModel.Table.lastAccess, "0");
        long id = db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        Log.e("db_id ", String.valueOf(id));

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 2);
        contentValues.put(SQLiteModel.Table.email, "b@b.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "58546587");
        contentValues.put(SQLiteModel.Table.name, "amal ali");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "riyadh");
        contentValues.put(SQLiteModel.Table.img, "");
        contentValues.put(SQLiteModel.Table.job, "student");
        contentValues.put(SQLiteModel.Table.officeHours, "");
        contentValues.put(SQLiteModel.Table.phone, "5579476565");
        contentValues.put(SQLiteModel.Table.firstAccess, "0");
        contentValues.put(SQLiteModel.Table.lastAccess, "0");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 3);
        contentValues.put(SQLiteModel.Table.email, "c.@c.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "635468498");
        contentValues.put(SQLiteModel.Table.name, "sarah mohaned");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "jaddah");
        contentValues.put(SQLiteModel.Table.img, ".");
        contentValues.put(SQLiteModel.Table.job, "student");
        contentValues.put(SQLiteModel.Table.officeHours, "");
        contentValues.put(SQLiteModel.Table.phone, "546468468");
        contentValues.put(SQLiteModel.Table.firstAccess, "");
        contentValues.put(SQLiteModel.Table.lastAccess, "");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 4);
        contentValues.put(SQLiteModel.Table.email, "dd@d.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "654986798");
        contentValues.put(SQLiteModel.Table.name, "turki talal");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "jaddah");
        contentValues.put(SQLiteModel.Table.img, ".");
        contentValues.put(SQLiteModel.Table.job, "student");
        contentValues.put(SQLiteModel.Table.officeHours, "");
        contentValues.put(SQLiteModel.Table.phone, "515454457");
        contentValues.put(SQLiteModel.Table.firstAccess, "0");
        contentValues.put(SQLiteModel.Table.lastAccess, "0");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 5);
        contentValues.put(SQLiteModel.Table.email, "e@e.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "654654");
        contentValues.put(SQLiteModel.Table.name, "rakan faisal");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "abha");
        contentValues.put(SQLiteModel.Table.img, "");
        contentValues.put(SQLiteModel.Table.job, "BCC & TUTOR");
        contentValues.put(SQLiteModel.Table.officeHours, "sun - wed from 9;00am to 10:am");
        contentValues.put(SQLiteModel.Table.phone, "515466546");
        contentValues.put(SQLiteModel.Table.firstAccess, "");
        contentValues.put(SQLiteModel.Table.lastAccess, "");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 6);
        contentValues.put(SQLiteModel.Table.email, "f@f.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "654654");
        contentValues.put(SQLiteModel.Table.name, "muhammed sultan");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "abha");
        contentValues.put(SQLiteModel.Table.img, "");
        contentValues.put(SQLiteModel.Table.job, "BCC & TUTOR");
        contentValues.put(SQLiteModel.Table.officeHours, "sun - wed from 9;00am to 10:am");
        contentValues.put(SQLiteModel.Table.phone, "58877445");
        contentValues.put(SQLiteModel.Table.firstAccess, "");
        contentValues.put(SQLiteModel.Table.lastAccess, "");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.userId, 7);
        contentValues.put(SQLiteModel.Table.email, "g@g.com");
        contentValues.put(SQLiteModel.Table.password, "1111");
        contentValues.put(SQLiteModel.Table.studentId, "654654");
        contentValues.put(SQLiteModel.Table.name, "rakan faisal");
        contentValues.put(SQLiteModel.Table.country, "ksa");
        contentValues.put(SQLiteModel.Table.course, ".");
        contentValues.put(SQLiteModel.Table.town, "jaddah");
        contentValues.put(SQLiteModel.Table.img, "");
        contentValues.put(SQLiteModel.Table.job, "BCC");
        contentValues.put(SQLiteModel.Table.officeHours, "sun - wed from 9;00am to 10:am");
        contentValues.put(SQLiteModel.Table.phone, "515466546");
        contentValues.put(SQLiteModel.Table.firstAccess, "");
        contentValues.put(SQLiteModel.Table.lastAccess, "");
        db.insert(SQLiteModel.Table.TABLE_Users, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        contentValues.put(SQLiteModel.Table.name, "Computer and Internet");
        contentValues.put(SQLiteModel.Table.courseAnnouncement, "Exam will be tomorrow , homework degree is 5");
        contentValues.put(SQLiteModel.Table.courseCoordinator, 7);
        contentValues.put(SQLiteModel.Table.content, "ksa");
        db.insert(SQLiteModel.Table.TABLE_Course, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        contentValues.put(SQLiteModel.Table.name, "circular and methodology");
        contentValues.put(SQLiteModel.Table.courseAnnouncement, "Exam will be tomorrow , homework degree is 2 ");
        contentValues.put(SQLiteModel.Table.courseCoordinator, 6);
        contentValues.put(SQLiteModel.Table.content, "ksa");
        db.insert(SQLiteModel.Table.TABLE_Course, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        contentValues.put(SQLiteModel.Table.name, "Education Tech");
        contentValues.put(SQLiteModel.Table.courseAnnouncement, "Exam will be tomorrow , homework degree is 3");
        contentValues.put(SQLiteModel.Table.courseCoordinator, 5);
        contentValues.put(SQLiteModel.Table.content, "ksa");
        db.insert(SQLiteModel.Table.TABLE_Course, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 1);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 4);
        contentValues.put(SQLiteModel.Table.excused, 6);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 8);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 2);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 2);
        contentValues.put(SQLiteModel.Table.userId, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 2);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 1);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 8);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 9);
        contentValues.put(SQLiteModel.Table.userId, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 3);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 10);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 2);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 10);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 8);
        contentValues.put(SQLiteModel.Table.userId, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 4);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 4);
        contentValues.put(SQLiteModel.Table.excused, 6);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 8);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 2);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 2);
        contentValues.put(SQLiteModel.Table.userId, 2);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 5);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 1);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 8);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 9);
        contentValues.put(SQLiteModel.Table.userId, 2);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 6);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 10);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 2);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 10);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 8);
        contentValues.put(SQLiteModel.Table.userId, 2);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 7);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 4);
        contentValues.put(SQLiteModel.Table.excused, 6);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 8);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 2);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 2);
        contentValues.put(SQLiteModel.Table.userId, 3);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 8);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 7);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 1);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 8);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 9);
        contentValues.put(SQLiteModel.Table.userId, 3);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.id, 9);
        contentValues.put(SQLiteModel.Table.sessionsCompleted, 10);
        contentValues.put(SQLiteModel.Table.present, 8);
        contentValues.put(SQLiteModel.Table.excused, 2);
        contentValues.put(SQLiteModel.Table.absent, 2);
        contentValues.put(SQLiteModel.Table.attendancePrecent, 5);
        contentValues.put(SQLiteModel.Table.attendanceGrade, 10);
        contentValues.put(SQLiteModel.Table.tma, 4);
        contentValues.put(SQLiteModel.Table.mta, 8);
        contentValues.put(SQLiteModel.Table.userId, 3);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_User_Courses, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Binary Data Representation and Computation");
        contentValues.put(SQLiteModel.Table.week, 1);
        contentValues.put(SQLiteModel.Table.block, "Block 1");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Hardware and Software Concept");
        contentValues.put(SQLiteModel.Table.week, 2);
        contentValues.put(SQLiteModel.Table.block, "Block 2");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Introduction to Python ");
        contentValues.put(SQLiteModel.Table.week, 3);
        contentValues.put(SQLiteModel.Table.block, "Block 3");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Introduction to problem solving in Python 1");
        contentValues.put(SQLiteModel.Table.week, 4);
        contentValues.put(SQLiteModel.Table.block, "Block 4");
        contentValues.put(SQLiteModel.Table.mta, 0);
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 1");
        contentValues.put(SQLiteModel.Table.week, 1);
        contentValues.put(SQLiteModel.Table.block, "Block 1");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 2");
        contentValues.put(SQLiteModel.Table.week, 2);
        contentValues.put(SQLiteModel.Table.block, "Block 2");
        contentValues.put(SQLiteModel.Table.mta, 0);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Organizing your Python code and Data ");
        contentValues.put(SQLiteModel.Table.week, 3);
        contentValues.put(SQLiteModel.Table.block, "Block 3");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Diving into data");
        contentValues.put(SQLiteModel.Table.week, 4);
        contentValues.put(SQLiteModel.Table.block, "Block 4");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 1");
        contentValues.put(SQLiteModel.Table.week, 1);
        contentValues.put(SQLiteModel.Table.block, "Block 1");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 2");
        contentValues.put(SQLiteModel.Table.week, 2);
        contentValues.put(SQLiteModel.Table.block, "Block 2");
        contentValues.put(SQLiteModel.Table.mta, 0);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Organizing your Python code and Data ");
        contentValues.put(SQLiteModel.Table.week, 3);
        contentValues.put(SQLiteModel.Table.block, "Block 3");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Diving into data");
        contentValues.put(SQLiteModel.Table.week, 4);
        contentValues.put(SQLiteModel.Table.block, "Block 4");
        contentValues.put(SQLiteModel.Table.mta, 1);
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_CourseContent, null, contentValues);



        
        ////////////////////////////////// forum
        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Binary Data Representation and Computation");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Hardware and Software Concept");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Introduction to Python ");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Introduction to problem solving in Python 1");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "GR100");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 1");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 2");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Organizing your Python code and Data ");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Diving into data");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed531");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 1");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Patterns, algorithms and programs 2");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Organizing your Python code and Data ");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.title, "Diving into data");
        contentValues.put(SQLiteModel.Table.content, "");
        contentValues.put(SQLiteModel.Table.courseCode, "Ed433");
        long i = db.insert(SQLiteModel.Table.TABLE_Forums, null, contentValues);

    }

    public boolean updateUser(User user) {

        SQLiteDatabase db = mySQLiteDB.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SQLiteModel.Table.email, user.getEmail());
        contentValues.put(SQLiteModel.Table.password, user.getPassword());
        contentValues.put(SQLiteModel.Table.studentId, user.getStudentId());
        contentValues.put(SQLiteModel.Table.name, user.getName());
        contentValues.put(SQLiteModel.Table.country, user.getCountry());
        contentValues.put(SQLiteModel.Table.course, user.getCourse());
        contentValues.put(SQLiteModel.Table.town, user.getTown());
        contentValues.put(SQLiteModel.Table.img, user.getImg());
        contentValues.put(SQLiteModel.Table.job, user.getJob());
        contentValues.put(SQLiteModel.Table.officeHours, user.getOfficeHours());
        contentValues.put(SQLiteModel.Table.phone, user.getPhone());
        contentValues.put(SQLiteModel.Table.firstAccess, user.getFirstAccess());
        contentValues.put(SQLiteModel.Table.lastAccess, user.getLastAccess());

        String selection = SQLiteModel.Table.userId + " = ?";
        String[] selectionArgs = {String.valueOf(user.getId())};

        int count = db.update(
                SQLiteModel.Table.TABLE_Users,
                contentValues,
                selection,
                selectionArgs);

        if (count == 0)
            return false;
        else
            return true;
    }

    public User getUser(String email, String password) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();
        String selection = SQLiteModel.Table.email + " = ? AND " + SQLiteModel.Table.password + " = ? ";
        String[] selectionArgs = {email, password};

        Cursor cursor = db.query
                (SQLiteModel.Table.TABLE_Users, null, selection, selectionArgs,
                        null, null, null);

        User user = null;

        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            user = new User();
            user.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.userId)));
            user.setEmail(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.email)));
            user.setPassword(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.password)));
            user.setStudentId(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.studentId)));
            user.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
            user.setCountry(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.country)));
            user.setCourse(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.course)));
            user.setTown(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.town)));
            user.setImg(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.img)));
            user.setJob(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.job)));
            user.setOfficeHours(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.officeHours)));
            user.setPhone(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.phone)));
            user.setFirstAccess(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.firstAccess)));
            user.setLastAccess(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.lastAccess)));
        }

        if(cursor != null)
            cursor.close();

        return user;
    }


    public List<CourseM> getMyCourses(int id) {

        List<CourseM> list = null;
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();

        String MY_QUERY = "SELECT * FROM TABLE_Course a INNER JOIN TABLE_User_Courses b ON a.courseCode = b.courseCode WHERE b.userId=?";

        Cursor cursor = db.rawQuery(MY_QUERY, new String[]{String.valueOf(id)});

        CourseM courseM ;
        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                courseM = new CourseM();
                courseM.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
                courseM.setSessionsCompleted(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.sessionsCompleted)));
                courseM.setPresent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.present)));
                courseM.setExcused(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.excused)));
                courseM.setAbsent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.absent)));
                courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendancePrecent)));
                courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendanceGrade)));
                courseM.setTma(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.tma)));
                courseM.setMta(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.mta)));
                courseM.setUserId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.userId)));
                courseM.setCourseCode(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCode)));
                courseM.setCourseAnnouncement(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseAnnouncement)));
                courseM.setCourseCoordinator(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCoordinator)));
                courseM.setContent(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.content)));
                courseM.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
                list.add(courseM);
            }
        }

        if(cursor != null)
            cursor.close();
        return  list;
    }

    public List<CourseM> getAllCourses() {

        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();

        String MY_QUERY = "SELECT * FROM TABLE_Course a INNER JOIN TABLE_User_Courses b ON a.courseCode = b.courseCode ";

        Cursor cursor = db.rawQuery(MY_QUERY, null);
        List<CourseM> list = null;

        CourseM courseM ;
        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                courseM = new CourseM();
                courseM.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
                courseM.setSessionsCompleted(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.sessionsCompleted)));
                courseM.setPresent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.present)));
                courseM.setExcused(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.excused)));
                courseM.setAbsent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.absent)));
                courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendancePrecent)));
                courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendanceGrade)));
                courseM.setTma(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.tma)));
                courseM.setMta(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.mta)));
                courseM.setUserId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.userId)));
                courseM.setCourseCode(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCode)));
                courseM.setCourseAnnouncement(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseAnnouncement)));
                courseM.setCourseCoordinator(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCoordinator)));
                courseM.setContent(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.content)));
                courseM.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
                list.add(courseM);
            }
        }
        return  list;
    }

    public CourseM getCourse(int userId, String courseCode) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();


        String MY_QUERY = "SELECT * FROM TABLE_Course a INNER JOIN TABLE_User_Courses b ON a.courseCode = b.courseCode WHERE b.userId=? AND b.courseCode =?";
        Cursor cursor = db.rawQuery(MY_QUERY, new String[]{String.valueOf(userId), courseCode});

        CourseM courseM = null;

        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            courseM = new CourseM();
            courseM.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
            courseM.setSessionsCompleted(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.sessionsCompleted)));
            courseM.setPresent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.present)));
            courseM.setExcused(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.excused)));
            courseM.setAbsent(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.absent)));
            courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendancePrecent)));
            courseM.setAttendanceGrade(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.attendanceGrade)));
            courseM.setTma(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.tma)));
            courseM.setMta(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.mta)));
            courseM.setUserId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.userId)));
            courseM.setCourseCode(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCode)));
            courseM.setCourseAnnouncement(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseAnnouncement)));
            courseM.setCourseCoordinator(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCoordinator)));
            courseM.setContent(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.content)));
            courseM.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
        }

        if(cursor != null)
            cursor.close();

        return courseM;
    }

    public List<CourseM> getCourses(String name) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();
        String selection = SQLiteModel.Table.courseCode + " LIKE ?  OR " + SQLiteModel.Table.name + " =  ? ";
        String[] selectionArgs = {"%"+ name+ "%", "%"+ name+ "%"};

        Cursor cursor = db.query
                (SQLiteModel.Table.TABLE_Course, null, selection, selectionArgs,
                        null, null, null);

        List<CourseM> list = null;
        CourseM courseM ;
        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                courseM = new CourseM();
                courseM.setCourseCode(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCode)));
                courseM.setCourseAnnouncement(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseAnnouncement)));
                courseM.setCourseCoordinator(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.courseCoordinator)));
                courseM.setContent(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.content)));
                courseM.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
                list.add(courseM);
            }
        }

        if(cursor != null)
            cursor.close();

        return  list;
    }



    public User getCoordinator(String courseCode) {

        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();

        String MY_QUERY = "SELECT * FROM TABLE_Course a INNER JOIN TABLE_Users b ON a.courseCoordinator = b.userId WHERE a.courseCode=?";

        Cursor cursor = db.rawQuery(MY_QUERY, new String[]{courseCode});

        User user = null;

        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            user = new User();
            user.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.userId)));
            user.setEmail(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.email)));
            user.setPassword(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.password)));
            user.setStudentId(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.studentId)));
            user.setName(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.name)));
            user.setCountry(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.country)));
            user.setCourse(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.course)));
            user.setTown(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.town)));
            user.setImg(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.img)));
            user.setJob(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.job)));
            user.setOfficeHours(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.officeHours)));
            user.setPhone(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.phone)));
            user.setFirstAccess(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.firstAccess)));
            user.setLastAccess(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.lastAccess)));
        }

        if(cursor != null)
            cursor.close();

        return user;
    }

    public List<CourseContentM> getCourseContent(String courseCode) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();
        String selection = SQLiteModel.Table.courseCode + " = ?  ";
        String[] selectionArgs = {courseCode};

        Cursor cursor = db.query
                (SQLiteModel.Table.TABLE_CourseContent, null, selection, selectionArgs,
                        null, null, null);

        List<CourseContentM> list = null;

        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                CourseContentM courseContentM = new CourseContentM();
                courseContentM.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
                courseContentM.setWeek(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.week)));
                courseContentM.setTitle(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.title)));
                courseContentM.setBlock(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.block)));
                list.add(courseContentM);
            }
        }

        if(cursor != null)
            cursor.close();

        return list;
    }

    public List<CourseContentM> getCourseExam(String courseCode) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();
        String selection = SQLiteModel.Table.courseCode + " = ?  AND " + SQLiteModel.Table.mta + " = 1";
        String[] selectionArgs = {courseCode};

        Cursor cursor = db.query
                (SQLiteModel.Table.TABLE_CourseContent, null, selection, selectionArgs,
                        null, null, null);

        List<CourseContentM> list = null;

        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                CourseContentM courseContentM = new CourseContentM();
                courseContentM.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
                courseContentM.setWeek(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.week)));
                courseContentM.setTitle(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.title)));
                courseContentM.setBlock(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.block)));
                list.add(courseContentM);

            }
        }

        if(cursor != null)
            cursor.close();

        return list;
    }

    public List<Forum> getCourseForum(String courseCode) {
        SQLiteDatabase db = mySQLiteDB.getReadableDatabase();
        String selection = SQLiteModel.Table.courseCode + " = ?";
        String[] selectionArgs = {courseCode};

        Cursor cursor = db.query
                (SQLiteModel.Table.TABLE_Forums, null, selection, selectionArgs,
                        null, null, null);

        List<Forum> list = null;

        if (cursor != null && cursor.getCount() > 0) {
            list = new ArrayList<>();
            while (cursor.moveToNext()) {
                Forum courseContent = new Forum();
                courseContent.setId(cursor.getInt(cursor.getColumnIndex(SQLiteModel.Table.id)));
                courseContent.setContent(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.content)));
                courseContent.setTitle(cursor.getString(cursor.getColumnIndex(SQLiteModel.Table.title)));
                list.add(courseContent);

            }
        }

        if(cursor != null)
            cursor.close();

        return list;
    }

}