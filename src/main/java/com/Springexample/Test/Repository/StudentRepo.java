package com.Springexample.Test.Repository;

import com.Springexample.Test.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
