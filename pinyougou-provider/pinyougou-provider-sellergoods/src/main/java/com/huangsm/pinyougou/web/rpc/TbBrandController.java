package com.huangsm.pinyougou.web.rpc;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.BrandFeignApi;
import com.huangsm.pinyougou.service.TbBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "/tbBrand",tags = "品牌管理接口模块")
@RestController
public class TbBrandController implements BrandFeignApi {
    @Autowired
    private TbBrandService brandService;


    @Value("${server.port}")
    private String port;
    @ApiOperation(value = "查询全部品牌信息",notes ="查询全部品牌信息" )
    @Override
    public List<TbBrand> findBrands(){
        System.out.println("被调用了"+port);
        return brandService.list();
    }

    @ApiOperation(value = "新建品牌信息",notes ="新建品牌信息" )
    @Override
    public boolean submitBrand(@RequestBody TbBrand brand){
        System.out.println("submitBrand被调用了");
        boolean flag = brandService.submitBrand(brand);
        return flag;
    }

}
