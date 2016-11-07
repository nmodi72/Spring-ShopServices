package com.demo.project.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.spr.service.ShopService;

public class ShopServiceImplTest {
    @Autowired
    private ShopService shopService;
    
    @Test
    public void testShop() {
        shopService.findById(6);

    }
}