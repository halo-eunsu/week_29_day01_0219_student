package com.nhnacademy.edu.springboot.student.domain;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    Student createStudent(Student student);

    Student getStudent(Long id);

    void deleteStudent(Long id);


    void deleteById(Long id);
}
