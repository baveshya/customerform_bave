package com.operations;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.accesspoints.TableOperations;
import com.connection.ConnectionProvider;
import com.entity.Customer;


public class CustomerDAO implements TableOperations {


	public boolean insert(Object row) 
	{
		try
		{
			Connection c=ConnectionProvider.getConnection();
			PreparedStatement p= c.prepareStatement("insert into Customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			Customer cu=(Customer)row;
			p.setInt(1, cu.getCif());
			p.setString(2,cu.getCustomer_title() );
			p.setString(3,cu.getCustomer_fname() );
			p.setString(4,cu.getCustomer_lname() );
			p.setString(5,cu.getCustomer_dob() );
			p.setString(6, cu.getCustomer_email());
			p.setInt(7,cu.getCustomer_phone() );
			p.setString(8,cu.getCustomer_gender() );
			p.setString(9, cu.getCustomer_address());
			p.setString(10,cu.getCustomer_city() );
			p.setString(11, cu.getCustomer_state());
			p.setInt(12,cu.getCustomer_zipcode() );
			p.setString(13, cu.getIdproof_type());
			p.setInt(14,cu.getIdproofno() );
			p.setString(15,cu.getAddress_type() );
			p.setInt(16,cu.getAddress_no() );
			p.executeUpdate();
			return true;
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	
	public boolean delete(Object row)
	{
		
		try
		{
			Connection c=ConnectionProvider.getConnection();
			PreparedStatement p= c.prepareStatement("delete Customer where cif=?");
			Customer cu=(Customer)row;
			p.setInt(1, cu.getCif());
			p.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
public boolean update(Object row)
	{
		try
		{
			Connection c=ConnectionProvider.getConnection();
			PreparedStatement p= c.prepareStatement("update Customer set customer_title=?, customer_fname=?,customer_lname=?,customer_dob=?,customer_email=?,customer_phone=?,customer_gender=?,customer_address=?,customer_city=?,customer_state=?,customer_zipcode=?,idproof_type=?,idproofno=?,address_type=?,address_no=? where cif=?");
			Customer cu=(Customer)row;
			//p.setInt(1, cu.getCif());
			p.setString(1,cu.getCustomer_title() );
			p.setString(2,cu.getCustomer_fname() );
			p.setString(3,cu.getCustomer_lname() );
			p.setString(4,cu.getCustomer_dob() );
			p.setString(5, cu.getCustomer_email());
			p.setInt(6,cu.getCustomer_phone() );
			p.setString(7,cu.getCustomer_gender() );
			p.setString(8, cu.getCustomer_address());
			p.setString(9,cu.getCustomer_city() );
			p.setString(10, cu.getCustomer_state());
			p.setInt(11,cu.getCustomer_zipcode() );
			p.setString(12, cu.getIdproof_type());
			p.setInt(13,cu.getIdproofno() );
			p.setString(14,cu.getAddress_type() );
			p.setInt(15,cu.getAddress_no() );
			p.setInt(16, cu.getCif());
			p.executeUpdate();
			
			
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
		
	public List<Customer> getRows()
	{
		try
		{
			Connection c=ConnectionProvider.getConnection();
			Statement s =c.createStatement();
			ResultSet rs=s.executeQuery("select * from Customer");
			List <Customer>l=new ArrayList<Customer>();
			while(rs.next())
			{
				Customer cus=new Customer();
				cus.setCif(rs.getInt(1));
				cus.setCustomer_title(rs.getString(2));
				cus.setCustomer_fname(rs.getString(3));
				cus.setCustomer_lname(rs.getString(4));
				cus.setCustomer_dob(rs.getString(5));
				cus.setCustomer_email(rs.getString(6));
				cus.setCustomer_phone(rs.getInt(7));
				cus.setCustomer_gender(rs.getString(8));
				cus.setCustomer_address(rs.getString(9));
				cus.setCustomer_city(rs.getString(10));
				cus.setCustomer_state(rs.getString(11));
				cus.setCustomer_zipcode(rs.getInt(12));
				cus.setIdproof_type(rs.getString(13));
				cus.setIdproofno(rs.getInt(14));
				cus.setAddress_type(rs.getString(15));
				cus.setAddress_no(rs.getInt(16));
				l.add(cus);
			}
			return l;
		}
		
			
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public Object getRow(int id) 
	{
		try
		{
		Connection c=ConnectionProvider.getConnection();
		Statement s =c.createStatement();
		ResultSet rs=s.executeQuery("select * from Customer where cif="+id);
		Customer cus=new Customer();
		if(rs.next())
		{
			
			cus.setCif(rs.getInt(1));
			cus.setCustomer_title(rs.getString(2));
			cus.setCustomer_fname(rs.getString(3));
			cus.setCustomer_lname(rs.getString(4));
			cus.setCustomer_dob(rs.getString(5));
			cus.setCustomer_email(rs.getString(6));
			cus.setCustomer_phone(rs.getInt(7));
			cus.setCustomer_gender(rs.getString(8));
			cus.setCustomer_address(rs.getString(9));
			cus.setCustomer_city(rs.getString(10));
			cus.setCustomer_state(rs.getString(11));
			cus.setCustomer_zipcode(rs.getInt(12));
			cus.setIdproof_type(rs.getString(13));
			cus.setIdproofno(rs.getInt(14));
			cus.setAddress_type(rs.getString(15));
			cus.setAddress_no(rs.getInt(16));
			
		}
		return cus;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		// TODO Auto-generated method stub
		
	}


	

}
