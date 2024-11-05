package com.example.crackerapp.Controller;

import com.example.crackerapp.Model.Product;
import com.example.crackerapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/addproduct")

    public String addproduct(@RequestBody  Product product){
         productService.createproduct(product);
         return "productsaved";
    }

    @GetMapping("/products")
    public List<Product> getproducts(Product product) {
        return productService.listAll();
    }

}
