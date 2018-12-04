package com.huangsm.pinyougou.service;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.hystrix.BrandFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 调用sellergoods-service服务的findAllBrands接口
 * @PACKAGE_NAME com.huangsm.pinyougou.service
 * @PROJECT_NAME pinyougou
 * @创建人 huang
 * @创建时间 2018/12/3
 */
@Component
@FeignClient(value = "sellergoods-service",fallback = BrandFeignHystrix.class)
public interface BrandFeignApi {

    @GetMapping("/tbBrand/findAllBrands")
    List<TbBrand> findBrands();

    @PostMapping("/tbBrand/submitBrand")
    boolean submitBrand(@RequestBody TbBrand brand) throws Exception ;

}
