package com.dungnv.project.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String category_id;
	@Column
	private String description;
	@Column
	private String image;
	@Column
	private BigDecimal price;
	@Column
	private int status;
	@Column
	@CreationTimestamp
	private Timestamp created_at;
	@Column
	@UpdateTimestamp
	private Timestamp updated_at;

}
