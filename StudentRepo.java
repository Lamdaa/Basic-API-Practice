package com.firstSpringBootProject.StudentAPI.StudentRepository;

import com.firstSpringBootProject.StudentAPI.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepo {
    HashMap<String, Student> studentDB;

    public StudentRepo() {
        this.studentDB = new HashMap<>();
        studentDB.put("Student1",new Student("Suraj","S_ID1","Mumbai",88,23,188.2,87.6));
        studentDB.put("Student2",new Student("Maitrey","S_ID2","Indore",68,23,188.2,87.6));
        studentDB.put("Student3",new Student("Rahul","S_ID3","Pune",89,20,188.2,87.6));
        studentDB.put("Student4",new Student("Anurag","S_ID4","Chennai",86,22,188.2,87.6));
        studentDB.put("Student5",new Student("Pawan","S_ID5","Bangalore",78,22,188.2,87.6));
        studentDB.put("Student6",new Student("Anand","S_ID6","Lucknow",98,21,188.2,87.6));
    }
    public void addStudent(Student obj ){
        String studentId=obj.getStudentId();
        studentDB.put(studentId,obj);
    }
    public Student getStudentDetailsById(String studentId){
        return studentDB.get(studentId);
    }
    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();
        for(String key : studentDB.keySet()){
            list.add(studentDB.get(key));
        }
        return list;
    }
}
