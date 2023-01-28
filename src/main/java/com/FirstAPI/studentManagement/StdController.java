package com.FirstAPI.studentManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
public class StdController {


    @Autowired
    stdService srv;





//    @GetMapping("/getstd")
//    public Student getStudent(@RequestParam("q") int enrollNo){
//        return mp.get(enrollNo);
//    }

    @GetMapping("/getstd/{enrollNo}")
    public ResponseEntity getStudent(@PathVariable("enrollNo") int id){
        Student student  = srv.getstudent(id);
        return new ResponseEntity(student, HttpStatus.FOUND);
    }



    @PostMapping("/addstd")
    public ResponseEntity addStudent(@RequestBody Student student){

        String response = srv.addStudent(student);

        return new ResponseEntity(response,HttpStatus.CREATED);

    }

    @DeleteMapping("/deletestd/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id){
        String response  = srv.deleteStudent(id);
        if(response.equals("Invalid Id")){
            return new ResponseEntity(response,HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(response,HttpStatus.FOUND);
    }

    @PutMapping("/updatestd/")
    public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("name") String name){
        String response = srv.updateStudent(id,name);
        if(response == null){
            return new ResponseEntity("Invalid request",HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(response,HttpStatus.ACCEPTED);
    }
}
