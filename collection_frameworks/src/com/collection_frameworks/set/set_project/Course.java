package com.collection_frameworks.set.set_project;

import java.util.Objects;

public class Course implements Comparable<Course> {
    private int courseId;
    private String courseName;
    private int credits;


    public Course() {}

    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (!(obj instanceof Course course)) return false;
        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }


    @Override
    public int compareTo(Course o) {
        return this.courseName.compareTo(o.courseName);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                '}';
    }

}
