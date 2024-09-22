package com.example.refactoring.encapsulation.encapsulate_collection;

import java.util.List;

public class BeforeEncapsulateCollection {

    class Student {
        private List<Course> courses;

        public List<Course> getCourses() {
            return courses;
        }
    }

    public void test() {
        Student student = new Student();

        List<Course> courses = student.getCourses();

        courses.add(new Course());
        courses.set(2, new Course());
        courses.remove(3);
    }

    class Course {

    }
}
