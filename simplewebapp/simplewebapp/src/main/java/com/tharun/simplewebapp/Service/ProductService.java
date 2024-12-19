package com.tharun.simplewebapp.Service;

import com.tharun.simplewebapp.Module.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> Products = new ArrayList<>(Arrays.asList(new Product(101, "Dell", 2000),
            new Product(102, "lenovo", 3000),
            new Product(103, "hp", 4000)
    ));

    public List<Product> getProduct() {
        return Products;
    }

    public Product getProductId(int prodId) {
        return Products.stream()
                .filter(p -> p
                        .getProductId() == prodId)
                .findFirst().get();

    }

    public void addProduct(Product prod) {
        Products.add(prod);

    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < Products.size(); i++) {
            if (Products.get(i).getProductId() == prod.getProductId()) ;
            {
                index = i;
                Products.set(index, prod);
            }

        }

    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < Products.size(); i++) {
            if (Products.get(i).getProductId() == prodId) ;
            {
                index = i;
                Products.remove(index);
            }

        }
    }
}


