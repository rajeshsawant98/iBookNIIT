package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping("/aboutus")
	public String n1()
	{
		return "aboutus";
	}
	
	@RequestMapping("/contactus")
	public String n2()
	{
		return "contactus";
	}
	
	@RequestMapping(value = {"/","/home"})
	public String n3()
	{
		return "index";
	}

}