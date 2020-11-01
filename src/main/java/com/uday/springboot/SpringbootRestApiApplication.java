package com.uday.springboot;

import com.uday.springboot.model.Product;
import com.uday.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestApiApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Television", "Electronic"));
        productRepository.save(new Product("sofa", "furniture"));
        productRepository.save(new Product("wardrobe", "funiture"));
    }
}
