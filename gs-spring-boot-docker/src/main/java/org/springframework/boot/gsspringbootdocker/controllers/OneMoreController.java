package org.springframework.boot.gsspringbootdocker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path = "/v2") 
public class OneMoreController {
	
	@GetMapping(path = "/getSomething")
	public @ResponseBody String getSomething() {
		return "Success ";
	}

}
