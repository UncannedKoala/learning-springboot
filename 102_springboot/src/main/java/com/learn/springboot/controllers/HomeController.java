package com.learn.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;


@RestController
public class HomeController {

//	http://localhost:8080/greet
	@GetMapping("/greet")
	public String greet() {
		return "Yo, what's good";
	}
	

//	http://localhost:8080/greetMe?name=Shantanu
	@GetMapping("/greetMe")
	public String greetMe(@RequestParam String name) {
		return "Hey, " + name + " bro";
	}
	
//	http://localhost:8080/greetUs?name1=Raj&name2=Abhay
	@GetMapping("/greetUs")
	public String greetUs(@PathParam("person1") String name1, @PathParam("person2") String name2) {
		return "Hey, "+ name1+" and "+name2;
	}
	
	
}

/* 
 * @RestController
 * -@RestController itself is annotated with @Controller and @ResponseBody, thus using one annotation 
 *  instead than using two while having the same functionality(press ctrl+(click on @RestController) check annotations on that class)
 * -Marks the class as a REST controller, writing directly to Response body and following the rules that REST defines
 * 
 * @GetMapping
 * -Short for @RequestMapping(method = RequestMethod.GET) and just needs the URL value
 * -Similarly there are other annotation to define each type of HTTP request:
 * @GetMapping
 * @PutMapping
 * @PostMapping
 * @DeleteMapping
 * @PatchMapping
 * 
 * 
 * @RequestParam
 * -Used on the variable deceleration in the method parameter.
 * -Is used to fetch values from the request parameter, the parameter name in the request should match to the the variable name in application.
 * -If the appropriate variables(with same name) are not passed the end-point will not even be hit, i.e.
 *  ->	http://localhost:8080/greetMe?naam=piyush	<- will not work at all, because 'naam' is used instead of 'name'
 * 
 * @PathParam
 * -SAME AS @RequestParam, only difference being that if the appropriate variables(with same name) are not passed 
 *  the values will not be initialized and will process the request with null as values, i.e.
 *  ->	http://localhost:8080/greetUs?per1=Raj&per2=Abhay	<-	will return null instead of names
 *  
 */










