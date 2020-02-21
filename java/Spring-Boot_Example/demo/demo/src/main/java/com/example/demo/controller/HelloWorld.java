package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(value ="/hi", method = RequestMethod.GET)
	public String getName(@PathVariable String name)
	{
		
		return "Hi "+name;
	}
}
