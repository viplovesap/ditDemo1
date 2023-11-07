package com.viplove.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.viplove.demo.Entity.*;
import com.viplove.demo.services.vendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VendorController {

	@Autowired
	vendorService vendorService;

	// GetEntiy Set
	@RequestMapping("/vendor")
	public List< Vendor> getVendors() {
		return vendorService.readAllVendors();
	}

//	 Get Entity
	@RequestMapping("/vendor/{vendorCode}")
	public Vendor getVendorsbyId(@PathVariable("vendorCode") Long code) {
		Optional<Vendor> searchResult =  vendorService.getSingleVendorsbyId(code);
	if(!searchResult.isPresent()) {
		return new Vendor((long)0,"","","","","","","","","","","");
	}
		return searchResult.get();
	}

	// Create Entity
	@PostMapping("/vendor")
	public Vendor createvendor(@RequestBody Vendor myPostBody) {
		return vendorService.createvendor(myPostBody);
	}

	// Create Entity
	@RequestMapping(method = RequestMethod.PUT, value = "/vendor")
	public Vendor updatevendor(@RequestBody Vendor myPostBody) {
		return vendorService.updatevendor(myPostBody,myPostBody.Id);
	}
    @RequestMapping("/vendor/search")
    public List<Vendor> searchByFirstName(@RequestParam String firstName){
    	return vendorService.searchByFisrtName(firstName);
    }
    @RequestMapping(method = RequestMethod.DELETE ,value = "/vendor/{id}")
    public String deleteVendor(@PathVariable("id") Long Id){
    	return vendorService.deleteVendor(Id);
    }
}
