package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Table(name = "CourseTable")
@Entity
public class Course {
	@Column(name = "cid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(name = "Title")
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[A-Z]{1}[a-z]{2.40}")
	private String title;
	
	@Min(0)
	@Max(20)
	@Column(name = "CreditPoints")
	private int creditPoints;
	
	@ManyToOne //many courses have linkage to one prof
	@JoinColumn(name = "Pid")
	private Professor professor;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getCid() {
		return cid;
	}
	
	private Course() {
		// TODO Auto-generated constructor stub
	}
	
	private Course(String title, int creditPoint, Professor professor ) {
		setTitle(title);
		setCreditPoints(creditPoint);
		setProfessor(professor);
		
	}
	public String toString() {
		String result = title + creditPoints + professor;
		return result;
	}
	
	

}
