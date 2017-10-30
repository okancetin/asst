package com.tb.dao.mapper;

import com.tb.model.Sales;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by okancetin on 30/10/17.
 */
public class SalesRowMapper implements RowMapper<List<Sales>> {

    final static Logger logger = Logger.getLogger(SalesRowMapper.class);

    @Override
    public List<Sales> mapRow(ResultSet resultSet, int i) throws SQLException {
        List<Sales> sales = new ArrayList<Sales>();

        while(resultSet.next()){
            Sales sale = new Sales();

            int id = resultSet.getInt("ID");
            sale.setId(id);

            String provider = resultSet.getString("PROVIDER");
            sale.setProvider(provider);

            try {
                String saleDateStr = resultSet.getString("SALE_DATE");
                sale.setSaleDate(saleDateStr);
            } catch (Exception e){
                //TODO handle the exception!!!
                logger.error("An exception occured mapRow "+e.getMessage());

            }

            Integer piece = resultSet.getInt("PIECE");
            sale.setPiece(piece);

            sales.add(sale);
        }


        return sales;
    }
}
