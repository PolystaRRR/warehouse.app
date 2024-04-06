package com.kochetov.warehouse.app.model;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column
    private String name;
    @Column(unique = true)
    private String article;
    @Column
    private String description;
    @Column
    private String category;
    @Column
    private BigDecimal price;
    @Column
    private int quantity;
    @Column
    private LocalDateTime last_quantity_update;
    @Column
    private LocalDateTime created_at;
}
