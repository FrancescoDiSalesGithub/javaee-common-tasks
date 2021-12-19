package com.francescodisalesgithub.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.francescodisalesgithub.dao.EmployeeDAO;
import com.francescodisalesgithub.database.ConnectionProperties;
import com.francescodisalesgithub.model.Developer;

public class EmployeeDTO implements EmployeeDAO
{

	public List<String> getAllBadges() 
	{
		List<String> badges = new ArrayList<String>();
		
		try 
		{
			ConnectionProperties co = new ConnectionProperties();
			PreparedStatement state = co.prepareStatement("Select badgeid from developer");
			ResultSet resultSet = state.executeQuery();
			
			while(resultSet.next())
			{
				badges.add(resultSet.getString(1));
			}
			
			co.close();
			
			return badges;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver is missing!");
		}

		return null;
	}

	public List<Developer> getDevelopers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Developer getDeveloperByBadgeId(String id) 
	{
		
		try 
		{
			ConnectionProperties co = new ConnectionProperties();
			PreparedStatement state = co.prepareStatement("Select badgeid,name,surname,age from developer where badgeid = ?");
			state.setString(1, id);
			ResultSet resultSet = state.executeQuery();
			
			Developer developer = new Developer();
			
			while(resultSet.next())
			{
				developer.setBadgeid(resultSet.getString(1));
				developer.setName(resultSet.getString(2));
				developer.setSurname(resultSet.getString(3));
				developer.setAge(resultSet.getInt(4));
				
			}
			
			co.close();
			
			return developer;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver is missing!");
		}
		
		// TODO Auto-generated method stub
		return null;
	}

}
