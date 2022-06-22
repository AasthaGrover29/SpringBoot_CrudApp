package com.example.springbootmongodbmysql.controller;

import com.example.springbootmongodbmysql.model.StudentModel;
import com.example.springbootmongodbmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/info")
    public String info(){
        return "The application is up...";
    }

    @PostMapping("/createresource")
    public String createStudent(@RequestBody StudentModel studentModel){
        return studentService.createResource(studentModel);
    }

    @GetMapping("/readresources")
    public List<StudentModel> readResources(){
        return studentService.readResources();
    }

    @GetMapping("/readresource/{email}")
    public List<StudentModel> readresource(@PathVariable String email){
        return studentService.readResource(email);
    }

    @PutMapping("/updateresource")
    public String updateStudent(@RequestBody StudentModel studentModel){
        return studentService.updateResource(studentModel);
    }

    @DeleteMapping("/deleteresource/{email}")
    public String deleteStudent(@PathVariable String email){
        return studentService.deleteResource(email);
    }
}
