package com.example.books.lms.Model;

public class SQLiteModel {


     abstract public class Table{

         public static final String TABLE_Users = "TABLE_Users";
         public static final String TABLE_Course = "TABLE_Course";
         public static final String TABLE_User_Courses = "TABLE_User_Courses";
         public static final String TABLE_Forums = "TABLE_Forums";
         public static final String TABLE_CourseContent = "TABLE_CourseContent";


         public static final String week = "week";
         public static final String block = "block";
         public static final String id = "id";
         public static final String userId = "userId";
         public static final String email = "email";
         public static final String password = "password";
         public static final String studentId = "studentId";
         public static final String name = "name";
         public static final String country = "country";
         public static final String town = "town";
         public static final String course = "course";
         public static final String firstAccess = "firstAccess";
         public static final String lastAccess = "lastAccess";
         public static final String img = "img";
         public static final String content = "content";
         public static final String courseCode = "courseCode";
         public static final String courseCoordinator = "courseCoordinator";
         public static final String courseAnnouncement = "courseAnnouncement";
         public static final String title = "title";
         public static final String job = "job";
         public static final String officeHours = "officeHours";
         public static final String phone = "phone";

         public static final String sessionsCompleted = "sessionsCompleted";
         public static final String present = "present";
         public static final String excused = "excused";
         public static final String absent = "absent";
         public static final String attendanceGrade = "attendanceGrade";
         public static final String attendancePrecent = "attendancePrecent";
         public static final String mta = "mta";
         public static final String tma = "tma";
         public static final String timeSpan = "tma";
         public static final String date = "date";

    }



    public abstract class Users {
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Table.TABLE_Users + " (" +
                        Table.userId + " INTEGER PRIMARY KEY, " +
                        Table.email + " TEXT, " +
                        Table.password + " TEXT, " +
                        Table.studentId + " TEXT, " +
                        Table.name + " TEXT, " +
                        Table.country + " TEXT, " +
                        Table.town + " TEXT, " +
                        Table.course + " TEXT, " +
                        Table.img + " TEXT, " +
                        Table.firstAccess + " TEXT, " +
                        Table.job + " TEXT, " +
                        Table.officeHours + " TEXT, " +
                        Table.phone + " TEXT, " +
                        Table.lastAccess + " TEXT " +
                        ")";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Table.TABLE_Users;
    }


    public abstract class Courses {
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Table.TABLE_Course + " (" +
                        Table.courseCode + " TEXT PRIMARY KEY, " +
                        Table.name + " TEXT, " +
                        Table.courseAnnouncement + " TEXT, " +
                        Table.courseCoordinator + " INTEGER, " +
                        Table.timeSpan + " TEXT, " +
                        Table.content + " TEXT " +
                        ")";

        public static final String SQL_DELETE_ENTRIES =

                "DROP TABLE IF EXISTS " + Table.TABLE_Course;
    }

    public abstract class User_Course {
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Table.TABLE_User_Courses + " (" +
                        Table.id + " INTEGER PRIMARY KEY, " +
                        Table.sessionsCompleted + " INTEGER, " +
                        Table.present + " INTEGER, " +
                        Table.excused + " INTEGER, " +
                        Table.absent + " INTEGER, " +
                        Table.attendancePrecent + " INTEGER, " +
                        Table.attendanceGrade + " INTEGER, " +
                        Table.tma + " INTEGER, " +
                        Table.mta + " INTEGER, " +
                        Table.userId + " INTEGER, " +
                        Table.courseCode + " TEXT " +
                        ")";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Table.TABLE_User_Courses;
    }

    public abstract class Forum {
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Table.TABLE_Forums + " (" +
                        Table.id + " INTEGER PRIMARY KEY, " +
                        Table.title + " TEXT, " +
                        Table.content + " TEXT, " +
                        Table.courseCode + " TEXT " +
                        ")";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Table.TABLE_Forums;
    }

    public abstract class CourseContent {
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Table.TABLE_CourseContent + " (" +
                        Table.id + " INTEGER PRIMARY KEY, " +
                        Table.title + " TEXT, " +
                        Table.week + " INTEGER, " +
                        Table.block + " TEXT, " +
                        Table.mta + " INTEGER, " +
                        Table.courseCode + " TEXT " +
                        ")";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Table.TABLE_Forums;
    }


}
