package org.example.product.service;

import org.example.product.repository.ProductRepository;
import org.example.product.model.ListProducts;
import org.example.product.model.RequestCreateProduct;
import org.example.product.model.ResponseCreatedProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.example.product.entities.Product;
import javax.transaction.Transactional;
import java.util.List;


@Service("localProductService")
@ConditionalOnProperty("product.micro.service")
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;
    /**
     * Find product by id from BaseData
     * @param id identify product
     * @return product object
     */
    @Override
    @Transactional
    public Product findById(Long id) {
        logger.info("find");
       return productRepository.findById(id).get();
    }

    /**
     * Delete product by id from BaseData
     * @param id identify product
     */
    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }


    /**
     * Find all products from BaseData
     * @return list products
     */
    @Override
    @Transactional
    public ListProducts findAllProduct() {

        List<Product> list =productRepository.findAll();
        System.out.println(list);
        logger.info(String.valueOf(list.size()));
        return new ListProducts(productRepository.findAll());
    }

    /**
     * Create new product to BaseData
     * @param requestCreateProduct object product from request
     * @return responseCreatedProduct object product to response
     */
    @Override
    @Transactional
    public ResponseCreatedProduct createProduct(RequestCreateProduct requestCreateProduct) {
        Product product = new Product();
        product.setName(requestCreateProduct.getName());
        product.setCost(requestCreateProduct.getCost());
        productRepository.save(product);
        logger.info(product.getId().toString());
        return new ResponseCreatedProduct(product);
    }
}
