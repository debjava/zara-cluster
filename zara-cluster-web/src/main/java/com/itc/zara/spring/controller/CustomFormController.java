package com.itc.zara.spring.controller;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * The Class CustomFormController.
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Controller
public class CustomFormController {

	/**
	 * Gets the index page.
	 *
	 * @return the index page
	 */
	@RequestMapping(value = { "/index"}, method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome to the world of BIG DATA");
		model.addObject("message", "Store anything");
		model.setViewName("hello");
		return model;
	}
	
	/**
	 * Welcome page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = { "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Hati Ghoda");
		model.addObject("message", "Ia m the hati");
		model.setViewName("hello");
		return model;
	}
	
	/**
	 * Admin page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");
		return model;
	}

	/**
	 * Login.
	 *
	 * @param error the error
	 * @param logout the logout
	 * @return the model and view
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");
		return model;
	}
	
	/**
	 * Access denied.
	 *
	 * @param model the model
	 * @param principal the principal
	 * @return the string
	 */
	@RequestMapping(value = "/403", method = RequestMethod.GET)  
	 public String accessDenied(ModelMap model, Principal principal) {  
	  String username = principal.getName();  
	  model.addAttribute("message", "Sorry "+username+" You don't have privileges to view this page!!!");  
	  return "403";  
	 }  

}