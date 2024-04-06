package com.kochetov.warehouse.app.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UuidGenerator;


import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.hibernate.annotations.UuidGenerator.Style.RANDOM;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @UuidGenerator(style = RANDOM)
    @Column(nullable = false)
    private UUID id;

    @Column
    @NotBlank
    private String name;

    @Column(unique = true)
    @NotBlank
    private String article;

    @Column
    @NotBlank
    private String description;

    @Column
    @NotBlank
    private String category;

    @Column
    @NotNull
    private BigDecimal price;

    @Column
    @NotNull
    private int quantity;

    @Column
    @NotNull
    private LocalDateTime last_quantity_update;

    @NotNull
    @Column
    private LocalDateTime created_at;


}
