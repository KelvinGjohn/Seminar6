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
	@Pattern"[A-Z]{1}[a-z]{2.40}")
	private String title;
	
	private int creditPoints;
	

}
