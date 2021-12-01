package com.example.demo.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Studenttable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Person_Id")
	private Integer id;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "Department")
	private String dept;
	@Column(name = "Age")
	private Integer age;
	@ManyToMany//(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_course",joinColumns = { @JoinColumn(name = "student_id")/*, nullable = false, updatable = false, insertable = false)*/}, inverseJoinColumns = {@JoinColumn(name = "course_id")} )
	private Set<UserTable> usertables = new HashSet<>() ;

	public Studenttable(Integer id, String studentName, Date dateOfBirth, String dept, Integer age,
			Set<UserTable> usertables) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dept = dept;
		this.age = age;
		this.usertables = usertables;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Studenttable [id=" + id + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth + ", dept="
				+ dept + ", age=" + age + ", usertables=" + usertables + ", getId()=" + getId() + ", getStudentName()="
				+ getStudentName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getDept()=" + getDept()
				+ ", getAge()=" + getAge() + ", getUsertables()=" + getUsertables() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	public Studenttable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<UserTable> getUsertables() {
		return usertables;
	}

	public void setUsertables(Set<UserTable> usertables) {
		this.usertables = usertables;
	}

}
