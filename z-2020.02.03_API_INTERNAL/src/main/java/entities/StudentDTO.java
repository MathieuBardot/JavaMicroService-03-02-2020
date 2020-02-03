package entities;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentDTO {

	private List<Grade> grades;
	private Student student;
	
	
	// g & s
	
	public StudentDTO(Student _student, List<Grade> _grades) {
		grades = _grades;
		student = _student;
	}

	
	

	public List<Grade> getGrades() {
		return grades;
	}


	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	
}
