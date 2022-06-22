package com.example.springbootmongodbmysql.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {


    private  String firstname;
    private String lastname;
    private  String email;
    private List<CourseModel> courses;


    @Override
    public String toString() {
        return "StudentModel{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", courses=" + courses +
                '}';
    }
}
