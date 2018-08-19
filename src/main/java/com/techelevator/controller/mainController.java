package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.State;
import com.techelevator.model.User;
import com.techelevator.model.UserDAO;
=======
>>>>>>> 14597d877d200e5a9576e850a0ce159f7e1f7f68


@Controller
@SessionAttributes("selectedState")


//@SessionAttributes({"tempClass", "parkDetails"})

public class mainController {


	//@Autowired
	//private ParkDAO parkdao; 
	
	
	@RequestMapping("/")
	public String displayHomePage(ModelMap model) {
		
		//model.addAttribute("parks", allParks); 
		
		//if (model.get("tempClass") != null) {
		//	System.out.println("HOMEPAGE..." + model.get("tempClass").toString()); 
	//	}
		
		return "main"; 
	}
	
	@RequestMapping("/main")
	public String displayMainPage(ModelMap model) {
		return "main";
	}
	
//	@RequestMapping("/stateInput")
//	public String displayStatePage(ModelMap model) {
//		return "redirect:/state";
//	}
	
	@RequestMapping("/state")
	public String displayStatePage(ModelMap model) {
		return "/state";
	}
	
	@RequestMapping(path="/stateInput", method=RequestMethod.GET)
	public String displayState(@RequestParam String state, ModelMap model) {
		State newState = new State();
		newState.setState(state);
		model.addAttribute("selectedState", newState);
		
		
		return "redirect:/state"; // <---- the jsp, not the js
	}
	
	@RequestMapping(path="/terms", method=RequestMethod.GET)
	public String displayTerms() {
		return "terms";
	}
	
	@RequestMapping(path="/copyright", method=RequestMethod.GET)
	public String displayCopyright() {
		return "copyright";
	}
}
	
	