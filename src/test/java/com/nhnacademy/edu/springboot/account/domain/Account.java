package com.nhnacademy.edu.springboot.account.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Account {

    private String number;

    private int balance;


}
