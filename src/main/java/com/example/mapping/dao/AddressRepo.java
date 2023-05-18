package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long>{
    
}
