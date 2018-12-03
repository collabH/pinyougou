package com.huangsm.pinyougou.controller;

import com.huangsm.pinyougou.domain.TbBrand;
import com.huangsm.pinyougou.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tbBrand")
public class TbBrandController {
    @Autowired
    private TbBrandService brandService;

    @GetMapping(value = "findAllBrands")
    public List<TbBrand> findBrands(){
        System.out.println("被调用了");
        return brandService.list();
    }
}
