package com.csen160.B_reflections.Examples;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_list")
public class CourseList implements Serializable {
	private static final long serialVersionUID = -290366730421097208L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="course_number")
	private String course_number;

	@Column(name = "course_name")
	private String course_name;

	@Column(name = "enrollment")
	private int enrollment;

	@Column(name = "start_date")
	private String start_date;

	@Column(name = "end_date")
	private String end_date;

	// add getters and setters
	public String getCourse_number() {
		return course_number;
	}

	public void setCourse_number(String course_number) {
		this.course_number = course_number;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	// Constructor	
	public CourseList() {
		super();
	}
	
	public CourseList(String course_name, int enrollment, String start_date, String end_date) {
		super();
		this.course_name = course_name;
		this.enrollment = enrollment;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	@Override
	public String toString() {
		return "CourseList "
				+"[Course Name = " + course_name + ", " + 
				" course_number =" + course_number + "," +
				" Enrollment =" + enrollment + "," + 
				" Start Date =" + start_date + "," + 
				" End Date =" + end_date + "]";
	}	
}