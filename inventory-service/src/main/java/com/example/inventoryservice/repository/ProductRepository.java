package com.example.inventoryservice.repository;

import com.example.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface ProductRepository extends JpaRepository<Product,String> {

}
