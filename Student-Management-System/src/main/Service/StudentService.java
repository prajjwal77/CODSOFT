package com.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Model.Student;
import com.Student.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Optional<Student> getStudentById(Long id){
		return studentRepository.findById(id);
		
	}
	

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
    
	public List<Student> findStudentByRollNumber(int rollNumber){
		return studentRepository.findByRollNumber(rollNumber);
	}
}
