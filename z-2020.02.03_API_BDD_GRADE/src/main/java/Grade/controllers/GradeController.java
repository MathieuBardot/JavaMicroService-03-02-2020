package Grade.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Grade.GradeRepository.GradeRepository;
import Grade.entities.Grade;

//@RestController
@Controller
@RequestMapping(path="/grade")

public class GradeController {

	@Autowired
	private GradeRepository gradeRepo;
	/*
	@GetMapping("/{id}")
	public @ResponseBody Iterable<Grade> getAllGrades(){
		return gradeRepo.findAll();
	}*/
	
	
}
