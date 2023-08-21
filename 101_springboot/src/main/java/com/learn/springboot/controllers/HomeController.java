package com.learn.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		return "Yo, what's good";
	}
	
	@RequestMapping(value = "/chat")
	public String chat() {
		return "So, how's life";
	}

	@RequestMapping("/bye")
	public String seeOff() {
		return "ok then, see you next time.";
	}
}

/* 
 * @Controller
 * -Tells spring that this class will be the one dealing with the incoming HTTP requests
 *  OR
 * -Tells spring that this is the class that has the mapping for URL -> request.
 *  And each method defines what subsequent actions for the request.
 * 
 * 
 * @ResponseBody
 * -Can be used on a class or methods.
 * -Tells Spring that all methods contained by this class(when used on class) OR this method(when used on method) will write to the response body
 *  Basically, looking at this spring takes the returned thing by this method and puts it into the response body before sending it to user
 * 
 * 
 * @RequestMapping
 * -Annotation for mapping web requests onto methods in request-handling classes(Controllers)
 * -Can be used both at the class and at the method level.
 * -There are many attributes that it has but we have used 'value'(defines the URL to which it responds) and 'method'(which HTTP method is used)
 *  when using just the value(URL) it can be defined as the seeOff() above, 
 *  but when multiple attributes are being used then it should convey which value is for which attribute, the way done in greet()
 * -There is one value per kind of HTTP request in RequestMethod enum, as follows:

   public enum RequestMethod {
		GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;

 */