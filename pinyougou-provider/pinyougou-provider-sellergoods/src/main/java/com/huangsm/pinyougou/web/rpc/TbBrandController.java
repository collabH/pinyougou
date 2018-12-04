package com.huangsm.pinyougou.web.rpc;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.TbBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "/tbBrand",tags = "品牌管理接口模块")
@RestController
@RequestMapping("/tbBrand")
public class TbBrandController {
    @Autowired
    private TbBrandService brandService;

    @ApiOperation(value = "查询全部品牌信息",notes ="查询全部品牌信息" )
    @GetMapping(value = "findAllBrands")
    public List<TbBrand> findBrands(){
        System.out.println("被调用了");
        return brandService.list();
    }
}
