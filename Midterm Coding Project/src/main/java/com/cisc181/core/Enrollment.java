package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

		private UUID SectionID;
		private UUID StudentID;
		private UUID EnrollementID;
		private double grade;
	
		private Enrollment(){
			
		}
		
		public Enrollment(UUID studID, UUID secID){
			StudentID = studID;
			SectionID = secID;
			EnrollementID = UUID.randomUUID();
		}
		
		public void setGrade(double g){
			grade = g;
		}
		
		public double getGrade(){
			return(grade);
		}
		
}
