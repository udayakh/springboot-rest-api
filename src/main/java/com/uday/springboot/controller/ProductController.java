package com.uday.springboot.controller;

import com.uday.springboot.exception.ProductNotFoundException;
import com.uday.springboot.service.ProductService;
import com.uday.springboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{pId}")
    public Product getProductById(@PathVariable("pId") Long id){
        return productService.getProductById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @PutMapping("{pId}")
    public void updateProduct(@RequestBody Product product, @PathVariable("pId") Long id){
        productService.updateProduct(product,id);
    }

    @DeleteMapping("{PId}")
    public void deleteProduct(@PathVariable("pId") Long id){
        productService.deleteProduct(id);
    }

}

