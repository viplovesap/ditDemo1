package com.viplove.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Address1")
public class address {
	@jakarta.persistence.Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	@Column(name="ADD_TYPE")
	private String addresstype;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="PINCODE")
	private String pincode;
	
	
	public address() {
		
	}
	
	public address(Long addressId, String addresstype, String street, String city, String state, String pincode) {
		super();
		this.addressId = addressId;
		this.addresstype = addresstype;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddresstype() {
		return addresstype;
	}

	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	
	
}
