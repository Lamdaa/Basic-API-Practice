package com.firstSpringBootProject.StudentAPI.Service;

import com.firstSpringBootProject.StudentAPI.Model.Student;
import com.firstSpringBootProject.StudentAPI.StudentRepository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
    //In this layer we will be providing the business logic of the Application such as -
    // 1) Bmi Calculator
    // 2) topper of the class
    // 3) average marks of the class

    StudentRepo studentRepo = new StudentRepo();
    // --> BMI CALCULATOR
    public double bmiCalculator(String studentId){
        Student obj = studentRepo.getStudentDetailsById(studentId);
        double height = obj.getHeight();
        double weight = obj.getWeight();
        double bmi = weight/(height*height);
        return bmi;
    }
    public String getTopper(){
        List<Student> studentList = studentRepo.getAllStudents();
        int marks =Integer.MIN_VALUE;
        String name="";
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getMarks()>marks){
                marks=studentList.get(i).getMarks();
                name=studentList.get(i).getName();
            }
        }
        return "The topper of the class is "+ name+" with marks scored as : "+marks;
    }
    public double avgMarks(){
        List<Student> studentList = studentRepo.getAllStudents();
        int sum = 0;
        for(int i=0;i<studentList.size();i++) {
            sum+=studentList.get(i).getMarks();
        }
        double avg =  sum/(studentList.size());
        return avg;
    }
    public List<Student> getStudentList(){
        List<Student> list = studentRepo.getAllStudents();
        return list;
    }
}
