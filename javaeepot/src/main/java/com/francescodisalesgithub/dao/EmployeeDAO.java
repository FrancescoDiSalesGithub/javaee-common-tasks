package com.francescodisalesgithub.dao;

import java.util.List;

import com.francescodisalesgithub.model.Developer;

public interface EmployeeDAO 
{
	
	public List<String> getAllBadges();
	public Developer getDeveloperByBadgeId(String id);
	public List<Developer> getDevelopers();

}
