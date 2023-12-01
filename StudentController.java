package com.firstSpringBootProject.StudentAPI.Controller;

import com.firstSpringBootProject.StudentAPI.Model.Student;
import com.firstSpringBootProject.StudentAPI.Service.ServiceLayer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class StudentController {
    ServiceLayer studentService = new ServiceLayer();
    @RequestMapping("/api/getTopper")
    @GetMapping
    public String getTopper(){
        return studentService.getTopper();
    }
    @RequestMapping("/api/getStudentList")
    @GetMapping
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
    @RequestMapping("/api/bmiCalculator")
    @GetMapping
    public double bmiCalculator(@RequestParam String studentId){
        return studentService.bmiCalculator(studentId);
    }
    @RequestMapping("/api/avgMarks")
    @GetMapping
    public double avgMarks(){
        return studentService.avgMarks();
    }
}
