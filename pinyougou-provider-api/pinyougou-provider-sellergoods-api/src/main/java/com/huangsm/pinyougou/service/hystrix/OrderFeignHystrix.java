package com.huangsm.pinyougou.service.hystrix;

import com.huangsm.pinyougou.service.OrderFeignApi;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME com.huangsm.pinyougou.order.api.service.hystrix
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/4
 */
@Component
public class OrderFeignHystrix implements OrderFeignApi {
    @Override
    public boolean submit() {
        return false;
    }
}
