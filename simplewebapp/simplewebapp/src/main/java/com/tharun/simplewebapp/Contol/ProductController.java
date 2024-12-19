package com.tharun.simplewebapp.Contol;

import com.tharun.simplewebapp.Module.Product;
import com.tharun.simplewebapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts() {
        return service.getProduct();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductId(prodId);
    }
@PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
    System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
  public void updateProduct( @RequestBody Product prod){
service.updateProduct(prod);

  }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
service.deleteProduct(prodId);
    }
}