package com.francescodisalesgithub.main;

import java.util.Iterator;
import java.util.List;

import com.francescodisalesgithub.dto.EmployeeDTO;
import com.francescodisalesgithub.model.Developer;

public class JavaEECommonTask {

	public static void main(String[] args) {
		
		System.out.println("TEST database");
		
		EmployeeDTO emp = new EmployeeDTO();
		Developer dev = emp.getDeveloperByBadgeId("1234");
		
		List<String> badges = emp.getAllBadges();
		Iterator<String> iterator = badges.iterator();
		
		if(dev != null)
		System.out.println("dev info: "+dev.getName()+" "+dev.getSurname()+" "+dev.getBadgeid()+" "+dev.getAge());
		else
			System.out.println("Something bad happen during the retrieval of the informations");
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
