package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;
    private Product product;
    private final List<Product> products = Collections.synchronizedList(new ArrayList<>());
    private final AtomicLong nextId = new AtomicLong(1);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    void setup(){
        productRepository = new ProductRepository();
        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
    }
    @Test
    void shouldFindAll(){
        assertEquals(productRepository.findAll(),products);
    }

    @Test
    void shouldFindById(){
        Optional<Product> actualOptional = productRepository.findById(1L);
        assertEquals(actualOptional,productRepository.findById(1L));
    }

    @Test
    void shouldSaveNew(){
        Product newProduct = new Product(null,"Watch",5000);
        Product savedProduct = productRepository.save(newProduct);
        assertEquals(4,savedProduct.getId());
        assertEquals("Watch",savedProduct.getName());
        assertEquals(5000,savedProduct.getPrice());
    }

    @Test
    void shouldSaveExisting(){
        Product newProduct = new Product(2L,"water",10);
        Product existingProduct = productRepository.save(newProduct);
        assertEquals(2,existingProduct.getId());
        assertEquals("water",existingProduct.getName());
        assertEquals(10d,existingProduct.getPrice());
    }

    @Test
    void shouldThrowException(){
        Product newProduct = new Product(100L,"Fake Product",1);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            productRepository.save(newProduct);
        });
        assertEquals("Product not found for update",ex.getMessage());
    }
}
