package com.mausamupdate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mausamupdate.exception.AdminAlreadyExistsException;
import com.mausamupdate.exception.AdminNotFoundException;
import com.mausamupdate.model.Admin;
import com.mausamupdate.repository.AdminRepository;


@Service
public class AdminServiceInmpl implements AdminServiceInterface{

	@Autowired
	   private AdminRepository adminRepository;

	   @Override
	   public Admin registerAdmin(Admin admin) {
	       Admin existingAdminOptional = adminRepository.findByEmail(admin.getEmail());

	       if (existingAdminOptional!=null) {
	           throw new AdminAlreadyExistsException("Admin already exists with this email: " + admin.getEmail());
	       }

	      
	       return adminRepository.save(admin);
	   }

	   

}
