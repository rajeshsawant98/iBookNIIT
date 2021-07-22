package com.niit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.UserDAO;
import com.niit.model.User;
//
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(ModelMap map)
	{
		map.addAttribute("user",new User());
		return "register";
	}
	
	@RequestMapping("/add")
	public String add(@ModelAttribute("user") User u) 
	{
		userDAO.addUser(u);
		return "redirect:/login";
	}
}