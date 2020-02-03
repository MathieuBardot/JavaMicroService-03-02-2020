package StudentRepository;

import org.springframework.data.repository.CrudRepository;
import entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
