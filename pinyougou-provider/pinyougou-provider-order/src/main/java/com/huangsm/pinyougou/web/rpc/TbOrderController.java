package com.huangsm.pinyougou.web.rpc;


import com.huangsm.pinyougou.domain.TbOrder;
import com.huangsm.pinyougou.service.OrderFeignApi;
import com.huangsm.pinyougou.service.TbOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author by.zl
 * @since 2018-12-04
 */
@Api(value = "/tbOrder",tags = "订单管理接口模块")
@RestController
public class TbOrderController implements OrderFeignApi {

    @Autowired
    private TbOrderService orderService;

    @ApiOperation(value = "测试分布式事务提交订单",notes ="测试分布式事务提交订单" )
    @Override
    public boolean submit(){
        TbOrder order=new TbOrder();
        order.setUserId("黄世民");
        order.setOrderId(1011l);
        order.setShippingName("测试分布式事务");
        return orderService.save1(order);
    }
}

