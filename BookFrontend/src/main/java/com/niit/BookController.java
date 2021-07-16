package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

	@RequestMapping("/")
	public String m1()
	{
		return "displaybooks";
	}
	
	@RequestMapping("/add")
	public String m2()
	{
		return "addbook";
	}
}
