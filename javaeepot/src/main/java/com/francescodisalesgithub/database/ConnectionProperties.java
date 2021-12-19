package com.francescodisalesgithub.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ConnectionProperties 
{
	private Connection con;
	
	public ConnectionProperties() throws SQLException, ClassNotFoundException
	{
		this.con = DriverManager.getConnection("jdbc:postgresql://172.18.0.2:5432/EEPOT","postgres","password");
	}
	
	public PreparedStatement prepareStatement(String query) throws SQLException
	{
		return this.con.prepareStatement(query);
	}
	
	public void commit() throws SQLException
	{
		this.con.commit();
	}
	
	public void close() throws SQLException
	{
		this.con.close();
	}

}
