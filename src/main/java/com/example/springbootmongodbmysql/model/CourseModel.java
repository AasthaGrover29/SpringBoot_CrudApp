package com.example.springbootmongodbmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {

    private String name;

    private String description;
    private String email;

    @Override
    public String toString() {
        return "CourseModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
