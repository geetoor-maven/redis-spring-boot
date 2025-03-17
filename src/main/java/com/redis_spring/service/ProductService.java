package com.redis_spring.service;

import com.redis_spring.model.Product;
import com.redis_spring.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        product.setIdProduct(UUID.randomUUID());
        return productRepository.save(product);
    }


}
