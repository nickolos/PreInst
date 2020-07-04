package org.example.product.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.product.entities.Product;

@Data
@NoArgsConstructor
public class ResponseCreatedProduct {
    private Long id;

    private String name;

    private int cost;

    public ResponseCreatedProduct(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.cost = product.getCost();
    }
}
