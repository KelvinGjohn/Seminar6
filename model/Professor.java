package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Table(name = "Professor")
@Entity

public class Professor {
	@Column(name = "Pid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	@Column(name= "Name")
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[A-Z]{1}[a-z]{2.40}")
	private String name;
	
	@Column(name = "Surname")
	@NotEmpty
	@NotNull
	@Pattern(regexp = "[A-Z]{1}[a-z]{2.40}")
	private String surname;

	
	
	@NotNull
	@Column(name = "Degree")
	private Degree degree;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public Degree getDegree() {
		return degree;
	}



	public void setDegree(Degree degree) {
		this.degree = degree;
	}



	public int getPid() {
		return pid;
	}
	
	private  Professor() {
		// TODO Auto-generated constructor stub
	}
	
	private Professor(String name, String surname, Degree degree) {
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	public String toString() {
		String result = name + surname + degree;
		return result;
	}
	
	

}
