package com.example.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString @Builder
public class Product {
  @Id
    private String id;
    private String name;
    private double price;
    private int quantity;

}
