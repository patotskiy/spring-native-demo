package com.github.patotskiy.springnativedemo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
}
