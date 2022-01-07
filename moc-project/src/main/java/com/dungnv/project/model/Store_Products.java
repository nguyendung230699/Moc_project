package com.dungnv.project.model;

import ch.qos.logback.classic.spi.CallerData;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "store_products")
public class Store_Products implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
	@EmbeddedId
	private Store_ProductKey id;
	@ManyToOne
	@MapsId("store_id")
	@JoinColumn(name = "store_id")
	private Store store;
	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private Product product;
	@Column
	private int quantity;
	@Column
	private int status;
}
