package com.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	List<Student> findByRollNumber(int rollNumber);

}
