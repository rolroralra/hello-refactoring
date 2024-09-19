package com.example.refactoring.encapsulate_collection;

import java.util.List;

public class AfterEncapsulateCollection {

    class Student {
        private Courses courses;

        public Courses getCourses() {
            return courses;
        }
    }

    class Courses {
        private List<Course> courses;

        public Courses(List<Course> courses) {
            this.courses = courses;
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public void removeCourse(Course course) {
            courses.remove(course);
        }
    }

    class Course {

    }

    public void test() {
        Student student = new Student();

        Courses courses = student.getCourses();

        courses.addCourse(new Course());
        courses.removeCourse(new Course());
    }


}
