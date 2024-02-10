package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Bios
 * @className GulimailProductApplicationTest
 * @description
 * @date 2024/02/10
 */
@SpringBootTest
class GulimailProductApplicationTest {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("HUAWEI");


        brandService.save(brandEntity);
        System.out.println(brandService.getById(1L));
    }
}