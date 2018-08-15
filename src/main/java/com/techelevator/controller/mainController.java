package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.User;
import com.techelevator.model.UserDAO;


@Controller
//@SessionAttributes({"tempClass", "parkDetails"})

public class mainController {


	//@Autowired
	//private ParkDAO parkdao; 
	
	
	@RequestMapping("/main")
	public String displayHomePage(ModelMap model) {
		
		//model.addAttribute("parks", allParks); 
		
		//if (model.get("tempClass") != null) {
		//	System.out.println("HOMEPAGE..." + model.get("tempClass").toString()); 
	//	}
		
		return "main"; 
	}
	
}
	
	