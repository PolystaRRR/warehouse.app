package com.kochetov.warehouse.app.repository;

import com.kochetov.warehouse.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, Long> {

}