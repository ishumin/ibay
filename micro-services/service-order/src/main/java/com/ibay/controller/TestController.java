package com.ibay.controller;

import com.ibay.domain.ResponseResult;
import com.ibay.feign.ProductTestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author shumin
 * @Date 15:35 5.28 0028
 * @Description 测试类
 **/
@RestController
@RequestMapping("test/")
public class TestController {

    @Autowired
    private ProductTestFeign productTestFeign;

    @GetMapping("hello")
    public ResponseResult hello(String msg){
        ResponseResult result = productTestFeign.hello(msg);
        return result;
    }

    @GetMapping("aa")
    public String aa(String msg){
        return "aa";
    }
}
