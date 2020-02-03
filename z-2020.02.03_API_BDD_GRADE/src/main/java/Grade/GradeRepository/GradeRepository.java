package Grade.GradeRepository;

import org.springframework.data.repository.CrudRepository;

import Grade.entities.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long> {

}
