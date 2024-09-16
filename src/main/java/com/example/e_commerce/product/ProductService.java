package com.example.e_commerce.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getproducts(){
        System.out.println("hello from Services");
        return List.of(
                new Product(
                        20225L,
                        "laptop",
                        400.2F,
                        LocalDate.of(2025, Month.JANUARY,13),
                        5
                ),
                new Product(
                        202250L,
                        "Mouse",
                        452.3F,
                        LocalDate.of(2025, Month.JANUARY,16),
                        1
                ),
                new Product(
                        202L,
                        "Teclado",
                        80.2F,
                        LocalDate.of(2025, Month.JANUARY,14),
                        3
                )
        );
    }
}
