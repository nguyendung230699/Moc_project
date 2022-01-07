package com.dungnv.project.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "stores")
@Data
public class Store implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String description;
	@Column
	@CreationTimestamp
	private Timestamp created_at;
	@Column
	@UpdateTimestamp
	private Timestamp updated_at;
//    @ManyToMany
//    @JoinTable(name = "store_products", joinColumns = @JoinColumn(name = "store_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
//    private List<Product> productList;

	
}
