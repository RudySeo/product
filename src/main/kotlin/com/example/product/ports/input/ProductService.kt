package com.example.product.ports.input

import com.example.product.domain.Product

interface ProductService {
    fun getAllProducts(): List<Product>
    fun getProductById(id: Long): Product?
    fun createProduct(product: Product): Product
    fun updateProduct(id: Long, updatedProduct: Product): Product?
    fun deleteProduct(id: Long)
}