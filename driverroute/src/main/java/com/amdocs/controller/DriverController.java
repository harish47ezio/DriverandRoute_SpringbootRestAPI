package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.entity.Driver;
import com.amdocs.service.DriverService;
import com.amdocs.service.impl.DriverServiceImpl;


@Controller
public class DriverController {
	
	@Autowired
	private DriverService drservice=new DriverServiceImpl();
	
	@RequestMapping("/")
	public String loadForm()
	{
		
		
		return "index";
	}
	
	@RequestMapping("/insertpage")
	public String insertpage(Model model)
	{
		
		Driver dr=new Driver();
		model.addAttribute("dr", dr);
		
		return "CreateDriver";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute("dr") Driver dr, Model model)
	{
		boolean saveDriver=drservice.saveDriver(dr);
		String msg="HI";
		if(saveDriver)
			msg="Updation Successful";
		else
			msg="Creation Failed";
		model.addAttribute("msg", msg);
		
		return "index";
	}
	
	@RequestMapping("/display")
	public String display(Model model)
	{
		List<Driver> allDrivers = drservice.getAllDrivers();
		model.addAttribute("Drivers", allDrivers);
		return "ReadDriver";
	}
	
	@RequestMapping("/edit")
	public String edit()
	{
		return "UpdateDriver";
	}
	
	@RequestMapping("/term")
	public String term()
	{
		return "DeleteDriver";
	}

}
