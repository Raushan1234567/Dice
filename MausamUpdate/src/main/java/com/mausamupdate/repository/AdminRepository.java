package com.mausamupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mausamupdate.model.Admin;



public interface AdminRepository extends JpaRepository<Admin, Long>{
	  Admin findByEmail(String email);
}
