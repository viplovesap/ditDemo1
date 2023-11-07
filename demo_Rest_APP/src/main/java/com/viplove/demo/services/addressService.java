package com.viplove.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.viplove.demo.Entity.*;
@Component
public class addressService {
 @Autowired
 IAddressPersistence address;
 
 
 public List<address> getAddress(){
	 return address.findAll();
 }
 
 public address createAddress(address payload) {
	 return  address.save(payload);
 }
}
