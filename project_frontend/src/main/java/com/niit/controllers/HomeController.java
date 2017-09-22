package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	HomeController(){
		System.out.println("Creating Instance of HomeConroller");
		//System.out.println("gotcategory");
	}
	
	@RequestMapping("/home")
	public String homepage(HttpSession session){
		session.setAttribute("categories", productService.getAllCategories());
		return "home";
	}
	
	/*@RequestMapping("/")
	public void firstpage(HttpSession session){
		System.out.println("gotcategory");
		session.setAttribute("categories", productService.getAllCategories());
	}*/
	
	@RequestMapping("/aboutus")
	public String aboutUs(){
		return "aboutus";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/games")
	public String games(){
		return "games";
	}
	
	@RequestMapping("/TermsConditions")
	public String TermsConditions(){
		return "TermsConditions";
	}
	
	@RequestMapping("/contactus")
	public String contactus(){
		return "contactus";
	}
}
