package clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import entities.Grade;
import entities.Student;
import feign.Param;
import feign.RequestLine;

@Component
@FeignClient(name="StudentClient")
public interface IStudentClient {
	
	@RequestLine("GET /grades")
	List<Student> getAll();
	
	@RequestLine("GET /{id}")
	Student getOneById(@Param("id") Integer id);
}
