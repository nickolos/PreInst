package service;


import model.ResponseProduct;
import org.springframework.web.bind.annotation.ResponseStatus;
import sun.security.provider.certpath.OCSPResponse;

import java.util.List;

public interface ProductService {

    //find 1 product by id
    ResponseProduct findById(Long id);

    //delete 1 product by id
    ResponseStatus deleteProduct (Long id);

    //find all product
    List<ResponseProduct> findAllProduct ();

}
