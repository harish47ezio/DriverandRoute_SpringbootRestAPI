package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Route;
import com.amdocs.service.DriverService;
import com.amdocs.service.RouteService;


@RestController
@RequestMapping("/routes")
public class RouteController {
	
	private RouteService routeserv;
	private DriverService drivserv;

	@Autowired
	public RouteController(RouteService routeserv, DriverService drivserv) {
		//super();
		this.routeserv = routeserv;
		this.drivserv=drivserv;
	}
	//Basic URI for API Testing
	
	//http://localhost:8085/books
	
	//insert into book_entity(book_name, pub_date)values(?,?);
	//http://localhost:8085/books/insert
	@PostMapping("/insert/{drno}")
	public Route saveRoute(@RequestBody Route route, @PathVariable Integer drno)
	{
		return routeserv.saveRoute(route, drno);
	}
	
	//select *from book_entity
	//http://localhost:8085/books/allbooks

	@GetMapping("/allbooks")
	public List<Route> getAllRoutes()
	{
		return routeserv.getAllroutes();
		
	}
	
	//select *from book_entity where isbnno=?
	//http://localhost:8085/books/1
	@GetMapping("/{rnno}")
	public Route getRouteById(@PathVariable Long rnno)
	{
		return routeserv.getRouteByRnno(rnno);
	}
	
	//http://localhost:8085/books/update/1
	@PutMapping("/update/{rnno}")
	public Route updateRoute(@PathVariable Long rnno,@RequestBody Route route)
	{
		return routeserv.updateRoute(rnno, route);
	}
	
	
	@DeleteMapping("/delete/{rnno}")
	public void deleteBook(@PathVariable Long rnno)
	{
		routeserv.deleteRoute(rnno);
	}

}
