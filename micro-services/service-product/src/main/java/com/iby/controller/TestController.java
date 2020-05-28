package com.iby.controller;

import com.ibay.domain.ResponseResult;
import com.ibay.domain.constant.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author shumin
 * @Date 15:37 5.28 0028
 * @Description 商品测试类
 **/
@RestController
@RequestMapping("test/")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * @Author shumin
     * @Date 15:38 5.28 0028
     * @Description 测试方法,
     **/
    @PostMapping("hello")
    public ResponseResult hello(@RequestParam("msg") String msg){
        logger.info("[TestController] - [hello] - params: {}", msg);
        return new ResponseResult(ResponseCode.CODE_200, "操作成功了");
    }
}
