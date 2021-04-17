package com.example.SpringBoot_Ex1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
	@GetMapping("/api")
	@ResponseBody
	public String getemployee()	
	{
		return "Hello Bala your Spring boot appplicat0ion Started no file";
	}
}
