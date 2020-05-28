package com.ibay.feign;

import com.ibay.domain.ResponseResult;
import com.ibay.domain.constant.ResponseCode;
import com.ibay.domain.constant.ServiceName;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author shumin
 * @Date 15:02 5.28 0028
 * @Description feign的测试类
 **/
@FeignClient(value = ServiceName.PRODUCT_SERVICE, fallbackFactory = ProductTestFeignFallback.class)
public interface ProductTestFeign {
    @PostMapping(value = "test/hello")
    ResponseResult hello(@RequestParam("msg")String msg);
}
@Component
class ProductTestFeignFallback implements ProductTestFeign, FallbackFactory<ProductTestFeign> {

    private static final Logger logger = LoggerFactory.getLogger(ProductTestFeignFallback.class);

    private Throwable throwable;

    public ProductTestFeignFallback(){
    }

    private ProductTestFeignFallback(Throwable throwable){
        this.throwable = throwable;
    }

    @Override
    public ProductTestFeign create(Throwable throwable) {
        return new ProductTestFeignFallback(throwable);
    }

    @Override
    public ResponseResult hello(String msg) {
        logger.error("ProductTestFeignFallback -> hello: {}", throwable);
        return new ResponseResult(ResponseCode.CODE_501);
    }
}