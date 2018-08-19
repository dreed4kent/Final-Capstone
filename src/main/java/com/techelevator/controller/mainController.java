package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
	
	@RequestMapping(path="/state", method=RequestMethod.GET)
	public String displayState(ModelMap model) {
		return "state"; // <---- the jsp, not the js
	}
	
	@RequestMapping(path="/terms", method=RequestMethod.GET)
	public String displayTerms() {
		return "terms";
	}
	
	@RequestMapping(path="/copyright", method=RequestMethod.GET)
	public String displayCopyright() {
		return "copyright";
	}
	
	@RequestMapping(path="/cookies", method=RequestMethod.GET)
	public String displayCookies() {
		return "cookies";
	}
}
	
	