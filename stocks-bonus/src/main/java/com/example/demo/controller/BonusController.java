package com.example.demo.controller;

import com.example.demo.mapper.ProductMapper;
import demo.entity.Product;
import demo.util.DrawLotteryUtil;
import demo.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "BonusController", description = "抽奖查询相关接口")
@RestController
@RequestMapping("/bonus")
public class BonusController {

    @Autowired
    private ProductMapper productMapper;

//    @ApiOperation(value = "1.会员登录", notes = "1.会员登录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "keyword", paramType = "query", value = "会员号或手机号", required = true, dataType = "String", defaultValue = "766647"),
//            @ApiImplicitParam(name = "password", paramType = "query", value = "密码", required = true, dataType = "String", defaultValue = "12345678"),
//            @ApiImplicitParam(name = "imgCode", paramType = "query", value = "图形验证码", required = true, dataType = "String", defaultValue = "1234"),
//    })
    //swagger 访问地址 http://localhost:18171/swagger-ui.html#!
    @ApiOperation(value = "1.获取奖品列表", notes = "1.获取奖品列表")
    @RequestMapping(value = "/getProductList" ,method = RequestMethod.GET)
    public ResponseResult getProductList(){
        return  new ResponseResult(ResponseResult.SUCCESS,"获取奖品列表",productMapper.getList());
    }

    @ApiOperation(value = "2.获取抽奖结果", notes = "2.获取抽奖结果")
    @RequestMapping(value = "/getBonusReult" ,method = RequestMethod.GET)
    public ResponseResult getBonusReult(){
        int index =0;
        List<Product> products=productMapper.getList();
        if (!products.isEmpty()){
            index= DrawLotteryUtil.drawGift(products);
        }
        return  new ResponseResult(ResponseResult.SUCCESS,"获取抽奖结果",products.get(index));
    }

}
