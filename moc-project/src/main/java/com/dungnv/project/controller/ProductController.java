package com.dungnv.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.dungnv.project.dto.ProductDTO;
import com.dungnv.project.model.Product;
import com.dungnv.project.service.ProductServiceimpl;

@RestController
@RequestMapping("/api")
// Hoan thien cac chuc nang code dua tren service
public class ProductController {
	@Autowired
	private ProductServiceimpl service;

	// functions show list product
	@RequestMapping("/")
	public String viewHomepage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}

	// function create new product
	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);

		return "new_product";

	}

	// function save
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);

		return "redirect:/";
	}

	// function edit product
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = service.get(id);
		mav.addObject("product", product);

		return mav;
	}

	// function delete product
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}

	@GetMapping("/getListProductDTO")
	public List<ProductDTO> getListProductDTO() {
		List<ProductDTO> productsList = service.getListProduct();
		return productsList;
	}

}
