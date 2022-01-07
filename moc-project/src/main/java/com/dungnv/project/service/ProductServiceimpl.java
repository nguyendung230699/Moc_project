package com.dungnv.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dungnv.project.dto.ProductDTO;
import com.dungnv.project.model.Product;
import com.dungnv.project.repository.ProductReponsitory;

// tao cac method de appcontroller call

@Service
public class ProductServiceimpl {
	@Autowired
	private ProductReponsitory repo; // mapping interface ProductRepon

	public List<Product> listAll() {
		return repo.findAll();
	}

	public void save(Product product) {

		repo.save(product);
	}

	public Product get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

	public List<ProductDTO> getListProduct() {

		return repo.searchProductId();
	}

}
