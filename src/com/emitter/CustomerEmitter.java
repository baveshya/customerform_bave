package com.emitter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class CustomerEmitter
 */
@WebServlet("/CustomerEmitter")
public class CustomerEmitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerEmitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
			int cif=Integer.parseInt(request.getParameter("cif"));
		response.setContentType("application/json");
		  ServletContextProvider.setServletContext(getServletContext());
		  TableOperations t=new CustomerDAO();
		  JSONObject j=new JSONObject();
		  Customer x=(Customer)t.getRow(cif);
		  j.put("cif", x.getCif());
		  j.put("title", x.getCustomer_title());
		  j.put("fname", x.getCustomer_fname());
		  j.put("lname", x.getCustomer_lname());
		  j.put("dob", x.getCustomer_dob());
		  j.put("email", x.getCustomer_email());
		  j.put("phone", x.getCustomer_phone());
		  j.put("gender", x.getCustomer_gender());
		  j.put("address", x.getCustomer_address());
		  j.put("city", x.getCustomer_city());
		  j.put("state", x.getCustomer_state());
		  j.put("zipcode", x.getCustomer_zipcode());
		  j.put("idno", x.getIdproof_type());
		  j.put("idproof", x.getIdproofno());
		  j.put("addressno", x.getAddress_type());
		  j.put("addressproof", x.getAddress_no());
		  
		  
	
	System.out.println(j.toJSONString());
    PrintWriter out=response.getWriter();
    out.println(j.toJSONString());
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
