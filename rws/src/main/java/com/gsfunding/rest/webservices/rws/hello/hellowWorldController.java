package com.gsfunding.rest.webservices.rws.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(path="/hello-world-bean")
	public helloWorldBean helloWorldBean() {
		return new helloWorldBean("this is my 2nd world");
	}

	@GetMapping(path="/hello-world/path-variable/{name}")
	public helloWorldBean helloWorldBean(@PathVariable String name) {
		return new helloWorldBean(String.format("this is my word %s", name));
	}
}
