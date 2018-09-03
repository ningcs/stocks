package com.example.demo.controller;


import com.example.demo.service.ProductService;
import demo.entity.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "BonusController", description = "抽奖查询相关接口")
@RestController
@RequestMapping("/news")
public class BonusController {

    @Autowired
    private ProductService productService;

//    @ApiOperation(value = "1.会员登录", notes = "1.会员登录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "keyword", paramType = "query", value = "会员号或手机号", required = true, dataType = "String", defaultValue = "766647"),
//            @ApiImplicitParam(name = "password", paramType = "query", value = "密码", required = true, dataType = "String", defaultValue = "12345678"),
//            @ApiImplicitParam(name = "imgCode", paramType = "query", value = "图形验证码", required = true, dataType = "String", defaultValue = "1234"),
//    })
    //swagger 访问地址 http://localhost:18172/swagger-ui.html#!
    @ApiOperation(value = "1.获取奖品列表", notes = "1.获取奖品列表")
    @RequestMapping(value = "/getProductList" ,method = RequestMethod.GET)
    public List<Product> getProductList(){
        return productService.getProductList();
    }

}
