package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Product product;

    @BeforeEach
    void setup() {
        product = new Product("milk", 100d);
        product = new Product(1L,"carbonara", 100d);
        System.setOut(new PrintStream(outContent));
    }
    @Test
    void validId(){
        product.setId(3L);
        assertEquals(3,product.getId());
    }

    @Test
    void validName(){
        product.setName("tyso");
        assertEquals("tyso",product.getName());
    }

    @Test
    void validPrice(){
        product.setPrice(1500d);
        assertEquals(1500d,product.getPrice());
    }

    @Test
    void validReturnString(){
        String expected = "Product{id=1, name='carbonara', price=100.0}";
        assertEquals(expected,product.toString());
    }
    @Test
    void validEqualityOfTwoObjects() {
        Product p1 = new Product(1L, "carbonara", 100d);
        Product p2 = new Product(1L, "carbonara", 100d);
        assertEquals(p1, p2);
    }
    @Test
    void validHashedObjects(){
        Object product1 = new Product(1L, "carbonara", 100d);
        Object product2 = new Product(1L,"carbonara", 100d);
        String hashed1= String.valueOf(product1.hashCode());
        String hashed2= String.valueOf(product2.hashCode());
        assertEquals(hashed1, hashed2);
    }

}