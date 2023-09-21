package com.amdocs.service;

import java.util.List;

import com.amdocs.entity.Driver;

public interface DriverService {

	boolean saveDriver(Driver dr);

	List<Driver> getAllDrivers();

}
