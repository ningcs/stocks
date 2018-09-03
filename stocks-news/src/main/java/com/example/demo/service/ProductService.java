package com.example.demo.service;

import demo.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("stocks-bonus")
public interface ProductService {
    @RequestMapping(value = "/bonus/getProductList" ,method = RequestMethod.GET)
    public List<Product> getProductList();

}
