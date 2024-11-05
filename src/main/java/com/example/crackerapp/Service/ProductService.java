package com.example.crackerapp.Service;

import com.example.crackerapp.Model.Product;
import com.example.crackerapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public String createproduct(Product product){
       productRepository.save(product);
       return "products";
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }

}
