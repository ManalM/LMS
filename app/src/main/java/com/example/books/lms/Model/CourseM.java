package com.example.books.lms.Model;

/**
 * Created by farou on 4/15/2019.
 */

public class CourseM {

    int id, sessionsCompleted, present, excused, absent, attendanceGPrecent, attendanceGrade,
             tma, mta, userId;
    private String name, courseCode, courseAnnouncement, courseCoordinator, content;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSessionsCompleted() {
        return sessionsCompleted;
    }

    public void setSessionsCompleted(int sessionsCompleted) {
        this.sessionsCompleted = sessionsCompleted;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getExcused() {
        return excused;
    }

    public void setExcused(int excused) {
        this.excused = excused;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getAttendanceGPrecent() {
        return attendanceGPrecent;
    }

    public void setAttendanceGPrecent(int attendanceGPrecent) {
        this.attendanceGPrecent = attendanceGPrecent;
    }

    public int getAttendanceGrade() {
        return attendanceGrade;
    }

    public void setAttendanceGrade(int attendanceGrade) {
        this.attendanceGrade = attendanceGrade;
    }

    public int getTma() {
        return tma;
    }

    public void setTma(int tma) {
        this.tma = tma;
    }

    public int getMta() {
        return mta;
    }

    public void setMta(int mta) {
        this.mta = mta;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseAnnouncement() {
        return courseAnnouncement;
    }

    public void setCourseAnnouncement(String courseAnnouncement) {
        this.courseAnnouncement = courseAnnouncement;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public void setCourseCoordinator(String courseCoordinator) {
        this.courseCoordinator = courseCoordinator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
