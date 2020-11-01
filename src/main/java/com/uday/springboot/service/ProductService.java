package com.uday.springboot.service;

import com.uday.springboot.model.Product;
import com.uday.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;



    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product,Long id){
        if(productRepository.findById(id).get() != null) {
            productRepository.save(product);
        }
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


}
