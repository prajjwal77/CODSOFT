package com.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Student.Model.Student;
import com.Student.Service.StudentService;



@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents", studentService.getAllStudents());
		return "home";
	}
	
	@GetMapping("/shownewStudentForm")
	public String showNewStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "new_student";
	}
	 @PostMapping("/saveStudent")
	    public String saveStudent(@ModelAttribute("student") Student student) {
	        studentService.saveStudent(student);
	        return "redirect:/";
	    }

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdates(@PathVariable (value ="id") Long id , Model model) {
		Student student = studentService.getStudentById(id).orElse(null);
		model.addAttribute("student",student);
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id")Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/";
	}
	@GetMapping("/seearchStudent")
	public String searchStudent(@RequestParam("rollNumber") int rollNuber, Model model) {
		List<Student> students = studentService.findStudentByRollNumber(rollNuber);
		model.addAttribute("listStudents",students);
		return "home";
	}
}
