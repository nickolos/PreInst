package org.example.product.service;

import org.example.product.model.ResponseCreatedProduct;
import org.example.product.model.ListProducts;
import org.example.product.model.RequestCreateProduct;
import org.example.product.entities.Product;

public interface ProductService {

    //find 1 org.product by id
    Product findById(Long id);

    //delete 1 org.product by id
    void deleteProduct (Long id);

    //find all org.product
    ListProducts findAllProduct ();

    //create org.product
    ResponseCreatedProduct createProduct (RequestCreateProduct requestCreateProduct);

}
