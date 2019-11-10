package org.sid.controllers;

import org.sid.dao.ProductRepository;
import org.sid.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PublicApiController {

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getProductInfo() {
        return  productRepository.findAll();
    }

}
