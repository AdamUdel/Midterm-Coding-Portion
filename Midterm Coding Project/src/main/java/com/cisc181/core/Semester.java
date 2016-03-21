package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {

	private UUID SemesterID;
	private Date startDate = new Date();
	private Date endDate = new Date();
	
	public Semester(UUID sID, Date start, Date end){
		
		SemesterID = sID;
		startDate = start;
		endDate = end;
		
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}
	
	
}
