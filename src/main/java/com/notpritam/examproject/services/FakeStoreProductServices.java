package com.notpritam.examproject.services;

import com.notpritam.examproject.models.Product;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreProductServices implements ProductServices {

    private final RestTemplate restTemplate = new RestTemplate();
    public String getProductName() {
        return "Fake Product";
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return new Product();
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Product> getProductsByCategory(String categoryName) {
        return null;
    }

    @Override
    public List<String> getCategories() {
        return null;
    }

    @Override
    public List<Product> getLimitedProducts(int limit) {
        return null;
    }

    @Override
    public List<Product> getSortedProducts(String sort) {
        return null;
    }
}
