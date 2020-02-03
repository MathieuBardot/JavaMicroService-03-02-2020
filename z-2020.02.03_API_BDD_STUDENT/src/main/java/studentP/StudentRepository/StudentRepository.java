package studentP.StudentRepository;

import org.springframework.data.repository.CrudRepository;

import studentP.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
