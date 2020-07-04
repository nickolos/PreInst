package org.example.product.controller;


import org.example.product.model.ResponseCreatedProduct;
import org.example.product.service.ProductService;
import org.example.product.entities.Product;
import org.example.product.model.ListProducts;
import org.example.product.model.RequestCreateProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@ConditionalOnProperty("product.micro.service")
@RequestMapping(value = "product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    @Qualifier("localProductService")
    ProductService productService;

    //GET http://localhost:9000/product/{id_product}
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, value = "/{id_product}")
    public Product findById(@PathVariable Long id_product) {
        logger.info("GET /org.product/" + id_product);
        return productService.findById(id_product);
    }

    //DELETE http://localhost:9000/product/{id_product}
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_product}")
    public void deleteProduct(@PathVariable Long id_product) {
        logger.info("DELETE /org.product/" + id_product);
        productService.deleteProduct(id_product);
    }

    //GET http://localhost:9000/product/findAll
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public ListProducts findAllProduct() {
        logger.info("GET /org.product/findAll");
        return productService.findAllProduct();
    }

    //POST http://localhost:9000/product/create
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseCreatedProduct createProduct (@RequestBody RequestCreateProduct requestCreateProduct) {
        logger.info("POST /org.product/create");
        return productService.createProduct(requestCreateProduct);
    }
}
