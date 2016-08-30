

package com.entity;

public class Customer
{
private int cif;
private String customer_title;
private String customer_fname;
private String customer_lname;
private String customer_dob;
private String customer_email;
private int customer_phone;
private String customer_gender;
private String customer_address;
private String customer_city;
private String customer_state;
private int customer_zipcode;
private String idproof_type;
private int idproofno;
private String address_type;
private int address_no;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int cif, String customer_title, String customer_fname, String customer_lname, String customer_dob, String customer_email,
		int customer_phone, String customer_gender, String customer_address, String customer_city,
		String customer_state, int customer_zipcode, String idproof_type, int idproofno, String address_type,
		int address_no) {
	super();
	this.cif = cif;
	this.customer_title = customer_title;
	this.customer_fname = customer_fname;
	this.customer_lname = customer_lname;
	this.customer_dob = customer_dob;
	this.customer_email = customer_email;
	this.customer_phone = customer_phone;
	this.customer_gender = customer_gender;
	this.customer_address = customer_address;
	this.customer_city = customer_city;
	this.customer_state = customer_state;
	this.customer_zipcode = customer_zipcode;
	this.idproof_type = idproof_type;
	this.idproofno = idproofno;
	this.address_type = address_type;
	this.address_no = address_no;
}

public int getCif() {
	return cif;
}
public void setCif(int cif) {
	this.cif = cif;
}
public String getCustomer_title() {
	return customer_title;
}
public void setCustomer_title(String customer_title) {
	this.customer_title = customer_title;
}

public String getCustomer_fname() {
	return customer_fname;
}

public void setCustomer_fname(String customer_fname) {
	this.customer_fname = customer_fname;
}

public String getCustomer_lname() {
	return customer_lname;
}

public void setCustomer_lname(String customer_lname) {
	this.customer_lname = customer_lname;
}

public String getCustomer_dob() {
	return customer_dob;
}

public void setCustomer_dob(String customer_dob) {
	this.customer_dob = customer_dob;
}

public String getCustomer_email() {
	return customer_email;
}

public void setCustomer_email(String customer_email) {
	this.customer_email = customer_email;
}

public int getCustomer_phone() {
	return customer_phone;
}

public void setCustomer_phone(int customer_phone) {
	this.customer_phone = customer_phone;
}

public String getCustomer_gender() {
	return customer_gender;
}

public void setCustomer_gender(String customer_gender) {
	this.customer_gender = customer_gender;
}

public String getCustomer_address() {
	return customer_address;
}

public void setCustomer_address(String customer_address) {
	this.customer_address = customer_address;
}

public String getCustomer_city() {
	return customer_city;
}

public void setCustomer_city(String customer_city) {
	this.customer_city = customer_city;
}

public String getCustomer_state() {
	return customer_state;
}

public void setCustomer_state(String customer_state) {
	this.customer_state = customer_state;
}

public int getCustomer_zipcode() {
	return customer_zipcode;
}

public void setCustomer_zipcode(int customer_zipcode) {
	this.customer_zipcode = customer_zipcode;
}

public String getIdproof_type() {
	return idproof_type;
}

public void setIdproof_type(String idproof_type) {
	this.idproof_type = idproof_type;
}

public int getIdproofno() {
	return idproofno;
}

public void setIdproofno(int idproofno) {
	this.idproofno = idproofno;
}

public String getAddress_type() {
	return address_type;
}

public void setAddress_type(String address_type) {
	this.address_type = address_type;
}

public int getAddress_no() {
	return address_no;
}

public void setAddress_no(int address_no) {
	this.address_no = address_no;
}

public Customer(int cif)
{
	this.cif=cif;
}



public String toString() {
	return "Customer [cif=" + cif + ", customer_title=" + customer_title + ",customer_fname=" + customer_fname + ", customer_lname=" + customer_lname
			+ ", customer_dob=" + customer_dob + ", customer_email=" + customer_email + ", customer_phone="
			+ customer_phone + ", customer_gender=" + customer_gender + ", customer_address=" + customer_address
			+ ", customer_city=" + customer_city + ", customer_state=" + customer_state + ", customer_zipcode="
			+ customer_zipcode + ", idproof_type=" + idproof_type + ", idproofno=" + idproofno + ", address_type="
			+ address_type + ", address_no=" + address_no + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}