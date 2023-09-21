package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Driver;
import com.amdocs.entity.Route;
import com.amdocs.repo.DriverRepository;
import com.amdocs.repo.RouteRepositary;

@Service
public class RouteService {
	private RouteRepositary routerepo;
	private DriverRepository drrepo;
	
	@Autowired
	public RouteService(RouteRepositary routerepo, DriverRepository drrepo) {
		//super();
		this.routerepo = routerepo;
		this.drrepo=drrepo;
	}


	//crud operations
	//savebook data
	//insert query is generated at runtime by server using hibernate and jpa
	public Route saveRoute(Route route, Integer drno)
	{
		Driver driver1=drrepo.findById(drno).orElse(null);
		if(driver1!=null)
		{
			route.setDrivers(driver1); 
			return routerepo.save(route); 
		}
		else
			return null;
			
	}
	

	public List<Route> getAllroutes()
	{
		return routerepo.findAll();
	}
	
	public 	Route getRouteByRnno(Long rnno)
	{
		return routerepo.findById(rnno).orElse(null);
	}

	public Route updateRoute(Long rnno, Route route)
	{
		Route existingbook=routerepo.findById(rnno).orElse(null);
		
		if(existingbook!=null)
		{
			existingbook.setStartPlace(route.getStartPlace());
			existingbook.setDestination(route.getDestination());
			existingbook.setStartDate(route.getStartDate());
			existingbook.setEndDate(route.getEndDate());
		return routerepo.save(existingbook);
		}
		return null;
	}
	
	public void deleteRoute(Long rnno)
	{
		 routerepo.deleteById(rnno);
	}

}
