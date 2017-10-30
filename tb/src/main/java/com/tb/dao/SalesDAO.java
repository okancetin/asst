package com.tb.dao;

import com.tb.model.Sales;

import java.util.List;

/**
 * Created by okancetin on 30/10/17.
 */
public interface SalesDAO {

    public List<Sales> findBySize(int size);
}
