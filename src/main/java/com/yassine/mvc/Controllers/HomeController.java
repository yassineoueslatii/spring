package com.yassine.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(value="/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(value="/blank")
	public String blankhome () {
		return "blank/blank";
	}

}
