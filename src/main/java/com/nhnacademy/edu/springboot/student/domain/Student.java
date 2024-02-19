package com.nhnacademy.edu.springboot.student.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Student {

    private String name;
    private Integer score;


    public Student(String name, Integer score){
        this.name = name;
        this.score = score;
    }

}
