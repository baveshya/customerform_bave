package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class ConnectionProvider 
{
	private static Connection connection;
	static
	{
		try
		{	ServletContext sc=ServletContextProvider.getServletContext();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Class.forName(sc.getInitParameter("class"));
		connection=DriverManager.getConnection(sc.getInitParameter("url"),"hr","hr");
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}

	public static  Connection getConnection()
	{
		return connection;
	}
}
//one connection established even called thousand times //