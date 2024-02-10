package com.atguigu.gulimail.coupon;

import com.atguigu.gulimail.coupon.entity.SmsCouponEntity;
import com.atguigu.gulimail.coupon.service.SmsCouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailCouponApplicationTests {
    @Autowired
    private SmsCouponService smsCouponService;
    @Test
    void contextLoads() {
        SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
        smsCouponEntity.setId(1L);
        smsCouponEntity.setCouponName("测试");
        smsCouponService.save(smsCouponEntity);
        System.out.println(smsCouponService.getById(1L));
    }

}
