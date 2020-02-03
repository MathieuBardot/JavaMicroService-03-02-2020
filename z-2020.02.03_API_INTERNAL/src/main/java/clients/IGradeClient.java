package clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import entities.Grade;
import entities.Student;
import feign.Param;
import feign.RequestLine;

@Component
@FeignClient(name="GradeClient")
public interface IGradeClient {
	
	@RequestLine("GET /grades")
	List<Grade> getAll();
	
	@RequestLine("GET /{id}")
	Grade getOneById(@Param("id") Integer id);
}
