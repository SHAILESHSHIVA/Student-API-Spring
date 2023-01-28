package com.FirstAPI.studentManagement;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Repository
public class stdRepository {

    Map<Integer,Student> mp = new HashMap<>();

    public Student getStudent(int enrollNo){
        return mp.get(enrollNo);
    }

    public String addStudent(Student student){
        int id = student.getEnrollNo();
        mp.put(id,student);

        return "student added";
    }

    public String deleteStudent(int id){
        if(!mp.containsKey(id)){
            return "Invalid id";
        }

        mp.remove(id);

        return "deleted form database";
    }

    public String updateStudent(int id,String name){

        if(!mp.containsKey(id)){
            return null;
        }

        mp.get(id).setName(name);

        return "updated info provided by you.";
    }
}
