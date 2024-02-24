package com.zw.comp367;


import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
	public String home(Model model)
	{
		int hour = LocalTime.now().getHour();
		
		String message = "";
		
		if(hour <= 12 && hour >= 17)
		{
			message = "Good afternoon, Zhenqiao, Welcome to COMP367";
		}
		else 
		{
			message = "Good morning, Zhenqiao, Welcome to COMP367";
		}
		
		model.addAttribute("message", message);
		
		return "index";
	}

}
