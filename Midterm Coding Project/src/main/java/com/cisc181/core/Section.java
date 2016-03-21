package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Section {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	Section(UUID semID, UUID cID,UUID secID, int rID){
		CourseID = cID;
		SemesterID = semID;
		SectionID = secID;
		RoomID = rID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}
	//Setters would be a safety hazzard.
}
