package com.example.demo.mapper;

import demo.entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {

    @Select("<script>" +
            "select * from Product" +
            "</script>")
    public List<Product> getList();
}
