package com.example.refactoring.encapsulation.encapsulate_collection;

import java.util.Collections;
import java.util.List;
import lombok.Getter;

/**
 * Encapsulate Collection
 *
 * @see Collections#emptyList()
 * @see Collections#singletonList(Object)
 * @see Collections#unmodifiableList(List)
 * @see List#of()
 */
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

    @Getter
    class Course {
        private String name;
        private String professor;
        private String description;
    }
}
