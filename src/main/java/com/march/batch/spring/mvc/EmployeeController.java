package com.march.batch.spring.mvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String greet(@PathVariable String name) {
		
		String ouptuString = "Hello Wellcome to Our First Spring MVC Project :: "+name;
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ OutPut ********:" + ouptuString);
		
		return ouptuString;
	}

}
