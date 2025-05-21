package com.premraj.service;

import com.premraj.model.Product;
import com.premraj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author premraj.murugaraj
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    public Product getProduct(Integer id){
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product with ID "+ id + " not found!"));
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
