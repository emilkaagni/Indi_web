package com.system.sharkMart.service;

import com.system.sharkMart.entity.Queries;
import com.system.sharkMart.pojo.QueriesPojo;

import java.util.List;

public interface QueryService {
    List<Queries> fetchAll();

    String save(QueriesPojo queriesPojo);
}
