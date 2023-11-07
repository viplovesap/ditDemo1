package com.viplove.demo.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viplove.demo.Entity.Vendor;

public interface IVendorPersistence extends JpaRepository<Vendor, Long > {
      List<Vendor> findByFisrtName(String FisrtName);
}
