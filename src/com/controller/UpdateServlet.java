package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{  ServletContextProvider.setServletContext(getServletContext());
		// TODO Auto-generated method stub
		int x=Integer.parseInt(request.getParameter("customerId"));
		TableOperations t=new CustomerDAO();
		//t.update(new Customer(x));
		Customer c=(Customer) t.getRow(x);
		request.setAttribute("clist", c);
		request.getRequestDispatcher("Form.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
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
		TableOperations t=new CustomerDAO();
		
		RequestDispatcher rd= request.getRequestDispatcher("report.jsp");
		request.setAttribute("customer", c);
		
		
		if(t.update(c))
			//response.sendRedirect("success.jsp");
			rd.forward(request,response);
		else
			
			response.sendRedirect("error.html");
			
		
	}

}
