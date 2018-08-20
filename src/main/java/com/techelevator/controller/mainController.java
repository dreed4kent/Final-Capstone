package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD

=======
>>>>>>> e47bb0b41aac01d703b0ec7c31fd148d8158e3c1
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.State;
import com.techelevator.model.User;
import com.techelevator.model.UserDAO;
<<<<<<< HEAD

=======
>>>>>>> e47bb0b41aac01d703b0ec7c31fd148d8158e3c1


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
	

	

	
	@RequestMapping(path="/stateInput", method=RequestMethod.GET)
	public String displayState(@RequestParam String state, ModelMap model, RedirectAttributes attr) {
		State newState = new State();
		newState.setState(state);
		model.addAttribute("selectedState", newState);
		attr.addFlashAttribute("flashState", newState);
		return "redirect:/state"; // <---- the jsp, not the js
	}
	
	@RequestMapping("/state")
	public String displayStatePage(Model model) {
		State state = (State) model.asMap().get("flashState");
		return "/state";
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
	
	