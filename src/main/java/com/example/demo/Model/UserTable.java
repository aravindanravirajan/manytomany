package com.example.demo.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_details")
public class UserTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	private String courseName;
	private Integer studentId;
	@ManyToMany(mappedBy = "usertables")//(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "usertables")
	private Set<Studenttable> studenttables = new HashSet<>();
	
	
	
	
	public UserTable(Integer courseId, String courseName, Integer studentId, Set<Studenttable> studenttables) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.studentId = studentId;
		this.studenttables = studenttables;
	}
	public Set<Studenttable> getStudenttables() {
		return studenttables;
	}
	public void setStudenttables(Set<Studenttable> studenttables) {
		this.studenttables = studenttables;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "UserTable [courseId=" + courseId + ", courseName=" + courseName + ", studentId=" + studentId
				+ ", studenttables=" + studenttables + ", getStudenttables()=" + getStudenttables() + ", getCourseId()="
				+ getCourseId() + ", getCourseName()=" + getCourseName() + ", getStudentId()=" + getStudentId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}