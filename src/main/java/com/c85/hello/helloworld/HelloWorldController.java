package com.c85.hello.helloworld;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.css.Counter;

@RestController
public class HelloWorldController {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public @ResponseBody Greeting hello(
			@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
		
	}
}
