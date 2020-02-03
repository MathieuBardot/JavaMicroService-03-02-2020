package GradeRepository;

import org.springframework.data.repository.CrudRepository;
import entities.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long> {

}
