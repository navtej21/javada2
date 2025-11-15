package com.studentportal.bean;



import com.studentportal.dao.CourseDAO;
import com.studentportal.model.Course;

import java.util.List;


public class CourseBean {

    private List<Course> courses;
    private Course selectedCourse;

    public CourseBean() {
        courses = new CourseDAO().getAllCourses();
    }

    public void enroll() {
        // add logic to enroll student
        System.out.println("Enrolled in course: " + selectedCourse.get);
    }

    // Getters & setters
}
