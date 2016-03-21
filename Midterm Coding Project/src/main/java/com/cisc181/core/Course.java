package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course{

	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private eMajor major;
	
	public Course (UUID cID, String name, int points, eMajor myMajor){
		courseID = cID;
		courseName = name;
		gradePoints = points;
		major = myMajor;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return major;
	}

	public void setMajor(eMajor major) {
		this.major = major;
	}

	public UUID getCourseID() {
		return courseID;
	}

	public String getCourseName() {
		return courseName;
	}
}
