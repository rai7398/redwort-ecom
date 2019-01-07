package com.redwort.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redwort.daoimp.ProductDAOImp;
import com.redwort.model.Product;

@RestController
public class UserController {
	
	@Autowired
	ProductDAOImp productDAOImp;
	
	@GetMapping(value ="/product" )
	public String myServices()
	{
	List<Product> list	=productDAOImp.list();
		return list.toString();
	}

}
