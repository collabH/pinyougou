package com.huangsm.pinyougou.service.impl;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.mapper.TbBrandMapper;
import com.huangsm.pinyougou.service.OrderFeignApi;
import com.huangsm.pinyougou.service.TbBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author by.zl
 * @since 2018-12-03
 */
@Service
public class TbBrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements TbBrandService {

    //测试分布式事务
    @Autowired
    private OrderFeignApi orderFeignApi;
    @Override
    @Transactional
    public boolean submitBrand(TbBrand brand) {

        boolean submit = orderFeignApi.submit();
        if (!submit){
            throw new RuntimeException("订单服务崩溃了哭~~~~~~~~~");
        }
        boolean save = save(brand);
        if (!save){
            throw new RuntimeException("品牌服务崩溃了哭~~~~~~~~~");
        }
        return  save&&submit;
    }
}
