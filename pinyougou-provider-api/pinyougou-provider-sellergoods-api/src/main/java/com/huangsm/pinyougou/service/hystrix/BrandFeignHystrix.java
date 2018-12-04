package com.huangsm.pinyougou.service.hystrix;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.BrandFeignApi;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @PACKAGE_NAME com.huangsm.pinyougou.service.hystrix
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/3
 */
@Component
public class BrandFeignHystrix implements BrandFeignApi {
    @Override
    public List<TbBrand> findBrands() {
        return null;
    }

    @Override
    public boolean submitBrand(TbBrand brand) {
        return false;
    }
}
