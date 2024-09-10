package com.example.product.core.ports.output

import com.example.product.core.domain.Product

interface ProductRepository {
    fun findAll(): List<Product>
    fun findById(id: Long): Product?
    fun save(product: Product): Product
    fun deleteById(id: Long)
}