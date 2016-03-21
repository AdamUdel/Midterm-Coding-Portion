package com.cisc181.core;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {

	@Test
	public void test() throws PersonException {
		Staff staff1 = new Staff("Bob","John","Smith", new Date(), "123 Main Street", "5555555555" , "bobsmith@gmail.com",
				"Monday 5pm", 5, 40000, new Date(), eTitle.MR);
		Staff staff2 = new Staff("Jennifer","Alicia","Jacobs", new Date(), "123 Main Street", "5555555555" , "jjacobs@gmail.com",
				"Tuesday 5pm", 5, 35000, new Date(), eTitle.MRS);
		Staff staff3 = new Staff("Ronald","Bilius","Weasley", new Date(), "123 Main Street", "5555555555" , "rweasley@gmail.com",
				"Wednesday 5pm", 5, 56000, new Date(), eTitle.MR);
		Staff staff4 = new Staff("Harry","James","Potter", new Date(), "123 Main Street", "5555555555" , "thechosen1@gmail.com",
				"Thursday 5pm", 5, 78000, new Date(), eTitle.MR);
		Staff staff5 = new Staff("Mark","Ben","Johnson", new Date(), "123 Main Street", "5555555555" , "markbenjohn@gmail.com",
				"Friday 5pm", 5, 44000, new Date(), eTitle.MR);
	
		double predictedAvgSalary = 50600.0;
		
		double avgSalary = (staff1.getSalary() + staff2.getSalary() + staff3.getSalary() + staff4.getSalary() + staff5.getSalary())/5;
		
		assert(predictedAvgSalary==avgSalary);
	}	

	@Test
	public void testPhoneNumber(){
		try {
			Class<?> c = Class.forName("com.cisc181.core.Staff");
			Object t = c.newInstance();
			Method mGetPhone = c.getDeclaredMethod("getPhone", null);

			Object oGetPhone = mGetPhone.invoke(t, null);

			String format = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			Pattern p = Pattern.compile(format);
			Boolean m = Pattern.matches(format, (CharSequence) oGetPhone);

			assert(m);
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDOB(){
		try {
			Class<?> c = Class.forName("com.cisc181.core.Staff");
			Object t = c.newInstance();
			Method mGetDOB = c.getDeclaredMethod("getDOB", null);

			Object oGetDOB = mGetDOB.invoke(t, null);

			Date currentDate = new Date();
			assert(((Date) oGetDOB).getDate() != currentDate.getDate()+100);
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
}
