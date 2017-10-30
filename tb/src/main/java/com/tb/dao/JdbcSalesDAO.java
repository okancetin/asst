package com.tb.dao;

import com.tb.dao.mapper.SalesRowMapper;
import com.tb.model.Sales;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by okancetin on 30/10/17.
 */

@Repository("salesDAO")
public class JdbcSalesDAO extends AbstractDao implements  SalesDAO {

    public JdbcSalesDAO(DataSource dataSource) {
        super(dataSource);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public List<Sales> findBySize(int size) {

        String sql = "SELECT ID, PROVIDER, PIECE, SALE_DATE FROM TOMATO where rowid between 1 and 3 order by sale_date desc";

        List<Sales> sales = jdbcTemplate.queryForObject("SELECT ID, PROVIDER, PIECE, SALE_DATE FROM TOMATO where rowid between 1 and ? order by sale_date desc", new SalesRowMapper(), size+1);

        return sales;
    }

}
