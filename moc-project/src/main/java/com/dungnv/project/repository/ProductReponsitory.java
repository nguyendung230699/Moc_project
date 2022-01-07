package com.dungnv.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dungnv.project.dto.ProductDTO;
import com.dungnv.project.model.Product;

// crteate interface extends JpaRepository  mapping (save(),find,delete,..
@Repository
public interface ProductReponsitory extends JpaRepository<Product, Long> {
	//public List<Product> findAll();

	@Query(value = "SELECT new com.dungnv.project.dto.ProductDTO("
			+ "p.id ,p.name,count(sp.store.id)"
			+ ") from Product  p "
			+ "inner join Store_Products  sp on p.id = sp.product.id"
			+ " group by p.id "
			)
	public List<ProductDTO> searchProductId();

}
