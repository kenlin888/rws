package com.gsfunding.rest.webservices.rws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Controller
@RestController
public class hellowWorldController {
     //GET 
	//URI -/hello-world
	@GetMapping(path="/hello-world")
	public String hellowWorld() {
		return "this is my world";
	}
}
