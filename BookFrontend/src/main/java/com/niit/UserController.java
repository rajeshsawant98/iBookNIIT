package com.niit;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
	public String add(@Valid @ModelAttribute("user") User u,BindingResult result) 
	{
		if(!result.hasErrors())
		{
		userDAO.addUser(u);
		return "redirect:/user/login";
		}
		else {
			return "register";
		}
	}
}