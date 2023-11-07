package com.viplove.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viplove.demo.Entity.address;

public interface IAddressPersistence extends JpaRepository<address, Long>{

}
