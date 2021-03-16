package com.org.prj.mod.myservice.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sun.istack.NotNull;

@RestController
@RequestMapping("api/v1/hello")
public class Personcontroller {
	
	
	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello " +name ;
	}
	
	
	
	
	
	
//	@PostMapping("/insert-person-data")
//	public 
}
