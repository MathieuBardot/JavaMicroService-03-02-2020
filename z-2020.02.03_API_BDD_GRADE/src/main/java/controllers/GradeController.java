package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import GradeRepository.GradeRepository;
import entities.Grade;

@RestController
public class GradeController {

	@Autowired
	private GradeRepository gradeRepo;
	
	@RequestMapping("/grade/{id}")
	public @ResponseBody Iterable<Grade> getAllGrades(){
		return gradeRepo.findAll();
	}
	
	
}
