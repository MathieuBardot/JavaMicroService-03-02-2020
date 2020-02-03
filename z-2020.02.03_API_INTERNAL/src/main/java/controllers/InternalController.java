package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entities.GradeDTO;
import entities.StudentDTO;
import feign.Param;
import services.InternalService;

@RestController
public class InternalController {

	@Autowired
	InternalService internalService;
	
	@RequestMapping("/grade/{id}")
	ResponseEntity<GradeDTO> getGrade(@Param("id") Integer gradeID){
		return new ResponseEntity<>(internalService.getGradeDTO(gradeID), HttpStatus.OK);
	}
	
	@RequestMapping("/student/{id}")
	ResponseEntity<StudentDTO> getStudent(@Param("id") Integer id){
		System.out.println("ok: "+ id);
		return new ResponseEntity<>(internalService.getStudentDTO(id), HttpStatus.OK);
	}
	
	@GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String index() {
		System.out.println("OOK");
	    return "OK ?";
	}

}
