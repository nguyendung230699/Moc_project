package com.dungnv.project.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;


@Setter
@Data
@AllArgsConstructor
public class ProductDTO {
	private Long id;
	private String name;
	private Long num_store;
}
