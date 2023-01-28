package com.FirstAPI.studentManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stdService {


    @Autowired
    stdRepository repo;

    public String addStudent(Student student){
        return repo.addStudent(student);
    }

    public Student getstudent(int id){
        return repo.getStudent(id);
    }

    public String deleteStudent(int id){
        return repo.deleteStudent(id);
    }

    public String updateStudent(int id,String name){
        return repo.updateStudent(id,name);
    }
}
