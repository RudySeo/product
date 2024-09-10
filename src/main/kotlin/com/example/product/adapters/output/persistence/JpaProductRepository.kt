package com.example.product.adapters.output.persistence

import com.example.product.core.domain.Product
import com.example.product.core.ports.output.ProductRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaProductRepository : ProductRepository, JpaRepository<Product, Long>