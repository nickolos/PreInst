package org.example.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.product.entities.Product;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListProducts {

    private List<Product> listProducts;
}
