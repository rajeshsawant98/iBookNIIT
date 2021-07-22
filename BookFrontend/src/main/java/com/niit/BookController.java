package com.niit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/")
	public String display(ModelMap map)
	{
		map.addAttribute("books",productDAO.displayProduct());
		return "displaybooks";
	}

	@GetMapping("/add")
	public String add(ModelMap map)
	{
		map.addAttribute("book", new Product());
		return "addbook";
	}
	
	@PostMapping("/add")
	public String add1(@ModelAttribute("book") Product p)
	{
		productDAO.addProduct(p);
		return "redirect:/book/";
	}
	
	@RequestMapping("/bookid/{id}")
	public String m4(@PathVariable("id") int bookid,ModelMap map)
	{
		map.addAttribute("book",productDAO.displayProductById(bookid));
		return "displaybook";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String m5(@PathVariable("id") int bookid)
	{
		Product p=new Product();
		p.setProdId(bookid);
		productDAO.deleteProduct(p);
		return "redirect:/book/";
	}
	
	@RequestMapping("/edit/{id}")
	public String m6(@PathVariable("id") int bookid,ModelMap map)
	{
		Product p=productDAO.displayProductById(bookid);
		map.addAttribute("b",p);
		return "addbook";
	}
	@RequestMapping("/update")
	public String m7(@ModelAttribute("b") Product p)
	{
		productDAO.updateProduct(p); 
		return "redirect:/book/";
	}
	

	
	
	
}