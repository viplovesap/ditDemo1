package com.viplove.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.viplove.demo.Entity.Vendor;
@RepositoryRestResource(collectionResourceRel = "vendor",path="newVendor")
public interface VendorControllerNew extends JpaRepository<Vendor, Long>{

}
