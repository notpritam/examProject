package com.notpritam.examproject.services;

import com.notpritam.examproject.models.Product;

import java.util.List;

public interface ProductServices {
    public List<Product> getProducts();
    public Product getProduct(Long id);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(Long id);
    public List<Product> getProductsByCategory(String categoryName);
    public List<String> getCategories();
    public List<Product> getLimitedProducts(int limit);
    public List<Product> getSortedProducts(String sort);
}
