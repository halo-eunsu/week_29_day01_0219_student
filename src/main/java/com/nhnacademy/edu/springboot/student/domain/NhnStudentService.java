package com.nhnacademy.edu.springboot.student.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NhnStudentService implements StudentService {



    private final StudentRepository studentRepository;

    public NhnStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElse(null);
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Student creatStudent(Student student){
        if( studentRepository.existById(student.getId()) ){
            throw  new IllegalStateException(("id : " + student.getId() + "is already exists" ));
        }
        return  studentRepository.save(student);
    }
}