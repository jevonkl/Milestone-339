package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.ProductModel;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductBusinessServiceInterface service;
	@SuppressWarnings("unused")
	@Autowired
	private SecurityBusinessService security;

	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("title", "Products");
		model.addAttribute("products", service.getProducts());
		return "products";
	}

	@PostMapping("/createProduct")
	public String createProduct(@Valid ProductModel productModel, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "createProduct";
		}
		System.out.println("CREATED NEW PRODUCT");
		return "loginSuccess";
	}

}
