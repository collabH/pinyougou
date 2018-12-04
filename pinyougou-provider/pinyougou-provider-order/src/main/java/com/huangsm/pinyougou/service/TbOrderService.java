package com.huangsm.pinyougou.service;

import com.huangsm.pinyougou.domain.TbOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author by.zl
 * @since 2018-12-04
 */
public interface TbOrderService extends IService<TbOrder> {

    boolean save1(TbOrder order);
}
