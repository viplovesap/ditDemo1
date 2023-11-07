package com.viplove.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="VENDOR")
public class Vendor {
	
	@jakarta.persistence.Id
	@Column(nullable=false,name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long Id ;
	
	@Column(nullable=false,name="COMP_NAME")
	public String CpmanyName ;
	
	@Column(nullable=false,name="CONT_NAME")
	public String ContactName ;
	
	@Column(nullable=false,name="FIRST_NAME")
	public String fisrtName ;
	
	@Column(nullable=false,name="LAST_NAME")
	public String lastName ;
	
	@Column(nullable=false,name="MIDDLE_NAME")
	public String middleName ;
	
	@Column(nullable=false,name="STATUS")
	public String status ;
	
	@Column(nullable=false,name="REGIS_NO")
	public String regNo ;
	
	

	@Column(nullable=false,name="PHONE_NB")
	public String Phone ;
	
	@Column(nullable=false,name="EMAIL_ID")
	public String email ;
	
	@Column(nullable=false,name="COUNTRY")
	public String country ;
	
	@Column(nullable=false,name="CITY")
	public String city ;
	
	@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL )
	@JoinColumn(name="vendor", referencedColumnName = "ID")
	private List<address> addresses = new ArrayList<>();
	
	
	public Vendor() {
		
	}
	
	public Vendor(long id, String cpmanyName, String contactName, String fisrtName, String lastName, String middleName,
			String status, String regNo, String phone, String email, String country, String city) {
		super();
		Id = id;
		this.CpmanyName = cpmanyName;
		ContactName = contactName;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.status = status;
		this.regNo = regNo;
		Phone = phone;
		this.email = email;
		this.country = country;
		this.city = city;
	}







	public List<address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<address> addresses) {
		this.addresses = addresses;
	}

	public long getId() {
		return Id;
	}




	public void setId(long id) {
		Id = id;
	}




	public String getCpmanyName() {
		return CpmanyName;
	}




	public void setCpmanyName(String cpmanyName) {
		CpmanyName = cpmanyName;
	}




	public String getContactName() {
		return ContactName;
	}




	public void setContactName(String contactName) {
		ContactName = contactName;
	}




	public String getFisrtName() {
		return fisrtName;
	}




	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getMiddleName() {
		return middleName;
	}




	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getRegNo() {
		return regNo;
	}




	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}




	public String getPhone() {
		return Phone;
	}




	public void setPhone(String phone) {
		Phone = phone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}
	
	
}
