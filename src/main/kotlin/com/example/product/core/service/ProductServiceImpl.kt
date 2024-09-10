package com.example.product.core.service

import com.example.product.core.domain.Product
import com.example.product.core.ports.input.ProductService
import com.example.product.core.ports.output.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {
    override fun getAllProducts(): List<Product> {
        return productRepository.findAll()
    }

    override fun getProductById(id: Long): Product? {
        return productRepository.findById(id)
    }

    override fun createProduct(product: Product): Product {
        return productRepository.save(product)
    }

    override fun updateProduct(id: Long, product: Product): Product? {
        // 기존 Product를 찾아서 존재할 경우 업데이트
        val existingProduct = productRepository.findById(id)
        return if (existingProduct != null) {
            val updatedProduct = existingProduct.copy(
                name = product.name,
                price = product.price
            )
            productRepository.save(updatedProduct)
        } else {
            null
        }
    }

    override fun deleteProduct(id: Long) {
        productRepository.deleteById(id)
    }
}