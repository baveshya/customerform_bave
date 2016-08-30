package com.controller;


import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int cif=Integer.parseInt(request.getParameter("cif"));
		String Customertitle=request.getParameter("ct");
		String  FirstName=request.getParameter("fn");
		String  LasttName=request.getParameter("ln");
		String dateofbirth=request.getParameter("dob");
		String  email=request.getParameter("em");
		int phone=Integer.parseInt(request.getParameter("pn"));
		String  gender=request.getParameter("gender");
		//String  female=request.getParameter("gender");
		String  address=request.getParameter("ad");
		int zipcode=Integer.parseInt(request.getParameter("zp"));
		String  City=request.getParameter("city");
		String  state=request.getParameter("state");
		String  idproof=request.getParameter("idp");
		int idproofnumber=Integer.parseInt(request.getParameter("id"));
		String  addressproof=request.getParameter("adp");
		int addressproofnumber=Integer.parseInt(request.getParameter("adn"));
		Customer c=new Customer( cif,  Customertitle, FirstName,  LasttName,  dateofbirth,  email,phone,
				   gender, address,City,
				 state,  zipcode, idproof, idproofnumber,  addressproof,
				 addressproofnumber);
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations p=new CustomerDAO();
		RequestDispatcher rd= request.getRequestDispatcher("report.jsp");
		request.setAttribute("customer", c);
		
		if(p.insert(c))
		{
		HttpSession h=request.getSession();
		Integer i=(Integer) h.getAttribute("records");
		if(i==null)
			i=0;
		i++;
		h.setAttribute("records", i);
		ServletContext context=getServletContext();
		Integer j=(Integer) context.getAttribute("records");
		if(j==null)
			j=0;
		j++;
		context.setAttribute("records2", j);
		
		
			//response.sendRedirect("success.jsp");
			rd.forward(request,response);
		}
		else
			response.sendRedirect("error.html");
	}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations t=new CustomerDAO();
		List<Customer> l= t.getRows();
		request.setAttribute("clist", l);
		System.out.println(l);
		request.getRequestDispatcher("customers.jsp").forward(request,response);
	}
	

}
