package com.huangsm.pinyougou.web.rpc;


import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.BrandFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author by.zl
 * @since 2018-12-03
 */
//@RefreshScope  //他是解决资源文件与javaConfig的同步问题的
@RestController
public class TbBrandController {

    @Autowired
    private BrandFeignApi brandFeignApi;

    @GetMapping(value = "/tbBrand/findAllBrands")
    public List<TbBrand> findBrands() {
        System.out.println("调用了服务提供者");
      return brandFeignApi.findBrands();
    }
}

