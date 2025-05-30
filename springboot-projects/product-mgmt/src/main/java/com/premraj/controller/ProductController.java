package com.premraj.controller;

import com.premraj.model.Product;
import com.premraj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author premraj.murugaraj
 */
@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/listAll")
    public ResponseEntity<List<Product>>  getAllProduct(){
        List<Product>products = productService.getAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable("id") Integer id){
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Product added Successfully!!!");
    }

    @DeleteMapping("/delProduct/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProductById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Product deleted Successfully!!!");
    }
}
