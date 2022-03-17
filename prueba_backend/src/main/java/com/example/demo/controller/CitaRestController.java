package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ICitaMedicaService;

@RestController
@RequestMapping("/ApiCitas/V1/citas")
public class CitaRestController {
	
	
	@Autowired
	private ICitaMedicaService citaService;
	
	

}
