package com.dungnv.project.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Store_ProductKey implements Serializable {
        @Column(name = "store_id")
        private int store_id;

        @Column(name = "product_id")
        private int product_id;
}
