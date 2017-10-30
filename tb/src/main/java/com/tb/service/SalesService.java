package com.tb.service;

import com.tb.model.Sales;

import java.util.List;

/**
 * Created by okancetin on 29/10/17.
 */

public interface SalesService {

    List<Sales> findBySize(Integer size);

    List<Sales> findAllSales();
}
