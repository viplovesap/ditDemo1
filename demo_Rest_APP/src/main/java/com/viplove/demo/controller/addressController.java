package com.viplove.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viplove.demo.Entity.address;
import com.viplove.demo.services.addressService;

@RestController
public class addressController {
	@Autowired
	addressService addressService;
	@RequestMapping("/address")
	 public List<address> getAddress(){
		 return addressService.getAddress();
	 }
	 @PostMapping("/address")
	 public address createAddress(@RequestBody address payload) {
		 return  addressService.createAddress(payload);
	 }
}
