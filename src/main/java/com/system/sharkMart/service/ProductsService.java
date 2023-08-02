package com.system.sharkMart.service;

import com.system.sharkMart.entity.Products;
import com.system.sharkMart.pojo.ProductsPojo;

import java.io.IOException;
import java.util.List;

public interface ProductsService {

    String save(ProductsPojo productsPojo) throws IOException;

    List<Products> fetchAll();

    Products fetchById(Integer id);

    void deleteById(Integer id);

}
