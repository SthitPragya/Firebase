package com.firebase.android.firebase;

public class Students {
    private String studentId;
    private String studentName;
    private String StudentClass;

    public Students(String studentId, String studentName, String studentClass) {
        this.studentId = studentId;
        this.studentName = studentName;
        StudentClass = studentClass;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentClass() {
        return StudentClass;
    }
}
