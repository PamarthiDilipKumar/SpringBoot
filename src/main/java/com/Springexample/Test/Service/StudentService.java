package com.Springexample.Test.Service;

import com.Springexample.Test.Entity.Student;
import com.Springexample.Test.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //it is used to mark class as service layer which contains the business logic
public class StudentService {
    @Autowired //automatic dependency injection
    private StudentRepo studentRepo;
    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
    public List<Student> findAll(){
        return studentRepo.findAll();
    }
    public Student findById(int id){
        return studentRepo.findById(id).orElseThrow();
    }
    public void deletebyId(int id){
        studentRepo.deleteById(id);
    }

}
