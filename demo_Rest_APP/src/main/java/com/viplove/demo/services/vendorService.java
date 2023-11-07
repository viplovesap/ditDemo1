package com.viplove.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.viplove.demo.Entity.Vendor;
@Component
public class vendorService {
//	HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
//	@Autowired
//	Vendor x;
//	@Autowired
//	Vendor y;
//	@Autowired
//	Vendor z;
	@Autowired
	IVendorPersistence vendor;
	public List< Vendor> readAllVendors(){
//		fillVendor();
//		   return vendors;
		
		return vendor.findAll();
	}
	public Optional<Vendor> getSingleVendorsbyId(Long id){
//		   fillVendor();
		   return vendor.findById(id);
	   }
	
	public Vendor createvendor( Vendor myPostBody){
//		myPostBody.country = "Newly created";
		   return vendor.save(myPostBody);
	   }
	public List<Vendor> searchByFisrtName(String CpmanyName){
		return vendor.findByFisrtName(CpmanyName);
	}
	
	
	public Vendor updatevendor( Vendor myPostBody, Long vendorID){
//		myPostBody.country = "Newly Company";
		   Optional<Vendor> vendorToBeUpdated = vendor.findById(vendorID);
		   if(vendorToBeUpdated.isPresent()) {
			   return vendor.save(myPostBody);
		   }else {
			   return new Vendor((long)0,"","","","","","","","","","","");
		   }
	   }
	public String deleteVendor(Long Id) {
		vendor.deleteById(Id);
		return "Deleted Succesfully ID : "+Id+"  :::from Database"; 
	}
//	private void fillVendor() {
//		vendors.put("1",x);
//		vendors.put("2",y);
//		vendors.put("3",z);
//	}
}
