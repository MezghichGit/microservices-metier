package com.sip.ams.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Value("${formateur}")  //sera lu depuis application.properties
	private String trainer;
	@Value("${formation}")  //sera lu depuis application.properties
	private String formation;
	@Value("${cible}")      //sera lu depuis application.properties
	private String cible;
	
	@Value("${infoProduct}")
	private String info;  //sera lu depuis product-service.properties
	
	@RequestMapping("/data")
	public String tellMe()
	{
		return "Data : " + trainer+" " +formation+ " " +cible + " "+info;
	}

}
