package com.example.demo.service.impl;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getList() {
        return productMapper.getList();
    }
}
