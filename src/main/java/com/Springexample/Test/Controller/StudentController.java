package com.Springexample.Test.Controller;

import com.Springexample.Test.Entity.Student;
import com.Springexample.Test.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudents")// for post operations
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

    @GetMapping("/all")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @GetMapping("/{id}")
    public Student findById(@PathVariable int id){
        return studentService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        studentService.deletebyId(id);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

}
