package com.connection;

import javax.servlet.ServletContext;

public class ServletContextProvider
{
public static ServletContext getServletContext() {
		return servletContext;
	}

	public static void setServletContext(ServletContext servletContext)
	{
		ServletContextProvider.servletContext = servletContext;
	}

private static ServletContext servletContext;
}
 