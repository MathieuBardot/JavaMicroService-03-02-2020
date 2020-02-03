package entities;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GradeDTO {

	private List<Student> students;
	private Grade grade;
	
	
	// g & s
	
	public GradeDTO(Grade y, List<Student> z) {
		grade = y;
		students = z;
	}

	
	

	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	
	



	
}
