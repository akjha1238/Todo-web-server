package com.comviva.app.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	@GetMapping(path="/")
	public String helloWorld()
	{
		return "Hello world";
	}

	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		//throw new RuntimeException("Some Error occured");
		return new HelloWorldBean("Hello World Bean from service");
	}

}
