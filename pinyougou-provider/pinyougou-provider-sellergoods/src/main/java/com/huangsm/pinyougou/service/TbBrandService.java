package com.huangsm.pinyougou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huangsm.pinyougou.domain.TbBrand;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author by.zl
 * @since 2018-12-03
 */
public interface TbBrandService extends IService<TbBrand> {

    boolean submitBrand(TbBrand brand);
}
