package com.example.file;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private Properties classpathProperties;
	
	@Autowired
	private Properties fileProperties;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		String classpath = 
				classpathProperties.getProperty("app.test");
		String file = 
				fileProperties.getProperty("app.test");
 
        model.addAttribute("classpath", classpath );
        model.addAttribute("file", file );
        return "home";
	}
	
}
