package com.demo.project.service;

import java.util.List;

import com.demo.project.datamodel.Shop;

public interface ShopService {

    public Shop create(Shop shop);
    public Shop delete(int id) throws Exception;
    public List findAll();
    public Shop update(Shop shop) throws Exception;
    public Shop findById(int id);

}