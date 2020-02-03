package studentP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import studentP.StudentRepository.StudentRepository;
import studentP.entities.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;
	
	@RequestMapping("/student/{id}")
	public @ResponseBody Iterable<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
}
