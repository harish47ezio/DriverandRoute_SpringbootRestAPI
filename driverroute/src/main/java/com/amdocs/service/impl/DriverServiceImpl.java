package com.amdocs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Driver;
import com.amdocs.repo.DriverRepository;
import com.amdocs.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	private DriverRepository drRepo;
	
	@Override
	public boolean saveDriver(Driver dr) {
		// TODO Auto-generated method stub
		Driver drsave=drRepo.save(dr);
		boolean flag=false;
		if(drsave!=null)
		{
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Driver> getAllDrivers() {
		// TODO Auto-generated method stub
		List<Driver> drrec=drRepo.findAll();
		return drrec;
	}
	

}
