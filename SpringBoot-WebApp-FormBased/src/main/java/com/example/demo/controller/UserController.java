package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value = "/loadForm")
	public String loadForm(Model model) {
		User userObj = new User();// form b  inding obj
		model.addAttribute("user", userObj);// storing in model
		return "user_reg";// logical view name
	}//loadForm(-)

// This method is used to handle user reg form submission
	
	@RequestMapping(value = "/registerForm", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		// logic to store in db
		model.addAttribute("succMsg","Registration Successfull");
		return "user_reg";// logical view name
	}//registerForm(-)

}//classs