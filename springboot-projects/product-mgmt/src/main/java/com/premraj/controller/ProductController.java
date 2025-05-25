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


}
