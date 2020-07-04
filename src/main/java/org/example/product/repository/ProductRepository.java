package org.example.product.repository;

import org.example.product.entities.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty("product.micro.service")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
