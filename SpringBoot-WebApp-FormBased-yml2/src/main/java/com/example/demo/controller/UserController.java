package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.caching.AppProperties;
import com.example.demo.constant.AppConstants;

@Controller
public class UserController {
	@Autowired
	private AppProperties appProps;
	@RequestMapping(value = "/loadForm")
	public String loadForm(Model model) {
		User userObj = new User();// form b  inding obj
		model.addAttribute("user", userObj);// storing in model
		return "user_reg";// logical view name
	}//loadForm(-)

// This method is used to handle user reg form submissiMon
	
	@RequestMapping(value = "/registerForm", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		String msg=appProps.getMessages().get(AppConstants.RegistrationSucess);
		// logic to store in db
		model.addAttribute(AppConstants.Success,msg);
		return AppConstants.loadForm;// logical view name
	}//registerForm(-)

}//classs