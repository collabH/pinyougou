package com.huangsm.pinyougou.service.impl;

import com.huangsm.pinyougou.domain.TbOrder;
import com.huangsm.pinyougou.mapper.TbOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huangsm.pinyougou.service.TbOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author by.zl
 * @since 2018-12-04
 */
@Service
public class TbOrderServiceImpl extends ServiceImpl<TbOrderMapper, TbOrder> implements TbOrderService {

    @Transactional
    @Override
    public boolean save1(TbOrder order) {

        return  save(order);
    }
}
