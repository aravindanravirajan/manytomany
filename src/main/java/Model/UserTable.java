package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserTable {
	@Id
	private Integer courseId;
	private String courseName;
	private Integer studentId;
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
				+ ", getCourseId()=" + getCourseId() + ", getCourseName()=" + getCourseName() + ", getStudentId()="
				+ getStudentId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public UserTable(Integer courseId, String courseName, Integer studentId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.studentId = studentId;
	}
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
