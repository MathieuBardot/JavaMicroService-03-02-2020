package services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import clients.IGradeClient;
import clients.IStudentClient;
import entities.Grade;
import entities.GradeDTO;
import entities.StudentDTO;
import entities.Student;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

@Service
@XSlf4j
@Data
public class InternalService {
	
	private IStudentClient studentRepo = Feign.builder()
			.client(new OkHttpClient())
			.encoder(new GsonEncoder())
			.decoder(new GsonDecoder())
			.logger(new Slf4jLogger(String.class))
			.logLevel(Logger.Level.FULL)
			.target(IStudentClient.class, "https://localhost:8081/student");
		
	private IGradeClient gradeRepo = Feign.builder()
			.client(new OkHttpClient())
			.encoder(new GsonEncoder())
			.decoder(new GsonDecoder())
			.logger(new Slf4jLogger(String.class))
			.logLevel(Logger.Level.FULL)
			.target(IGradeClient.class, "https://localhost:8082/grade");
	

	
	public GradeDTO getGradeDTO(Integer gradeid) {
		
		System.out.println("Call to the grade client : getOneById : " + gradeid);
		Grade grade = gradeRepo.getOneById(gradeid);
		
		System.out.println("Call to the grade client : getAll");
		List<Student> students = studentRepo.getAll().stream()
				.filter(s -> s.getId().equals(gradeid)).collect(Collectors.toList());
				
		return new GradeDTO(grade, students);
		
	}
	
	
	public StudentDTO getStudentDTO(Integer studentid) {
		
		System.out.println("Call to the student client : getOneById : " + studentid);
		Student student = studentRepo.getOneById(studentid);
		
		System.out.println("Call to the grade client : getAll");
		List<Grade> grades = gradeRepo.getAll().stream()
				.filter(s -> s.getId().equals(studentid)).collect(Collectors.toList());
				
		return new StudentDTO(student, grades);
		
	}
	
	
}
