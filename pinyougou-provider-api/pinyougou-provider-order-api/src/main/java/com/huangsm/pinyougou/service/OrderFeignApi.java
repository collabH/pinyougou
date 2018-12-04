package com.huangsm.pinyougou.service;

import com.huangsm.pinyougou.service.hystrix.OrderFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 订单服务api
 * @PACKAGE_NAME com.huangsm.pinyougou.order.api.service
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/4
 */
@Component
@FeignClient(value = "order-service", fallback = OrderFeignHystrix.class)
public interface OrderFeignApi {
    @PostMapping(value = "/sumbitOrder")
    boolean submit();

}
