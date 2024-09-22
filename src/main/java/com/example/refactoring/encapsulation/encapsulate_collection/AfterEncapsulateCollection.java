package com.example.refactoring.encapsulation.encapsulate_collection;

import java.util.List;
import lombok.Getter;

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

    @Getter
    class Course {
        private String name;
        private String professor;
        private String description;
    }

    public void test() {
        Student student = new Student();

        Courses courses = student.getCourses();

        courses.addCourse(new Course());
        courses.removeCourse(new Course());
    }


}
