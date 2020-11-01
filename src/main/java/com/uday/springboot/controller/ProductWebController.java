package com.uday.springboot.controller;

import com.uday.springboot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductWebController {
    @Autowired
    ProductController productController;

    @GetMapping("/")
    public String getAllProducts(Model model){
        List<Product> productList = productController.getProducts();
        model.addAttribute("products",productList);
        return "list_products";
    }
}
