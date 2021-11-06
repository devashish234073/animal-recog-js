package com.devashish.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Devashish Priyadarshi
 *
 */
@Controller
public class MainController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("Message1 from java class");
		messages.add("Message2 from java class");
		messages.add("Message3 from java class");
		messages.add("Message4 from java class");
		messages.add("Message5 from java class");
		return new ModelAndView("welcome", "messages", messages);
	}
	
	@RequestMapping("/home")
	public ModelAndView index() {
		String message = "";
		return new ModelAndView("index", "message", message);
	}
}