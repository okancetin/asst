package com.tb.service;

import com.tb.dao.SalesDAO;
import com.tb.model.Sales;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by okancetin on 29/10/17.
 */

@Service("salesService")
public class SalesServiceImpl implements SalesService {

    final static Logger logger = Logger.getLogger(SalesServiceImpl.class);

    @Autowired
    SalesDAO salesDAO;

    @Override
    public List<Sales> findBySize(Integer size) {

        logger.info("Started findBySize with param size : "+size);

        List<Sales> result = new ArrayList<Sales>();
        Sales sales = new Sales();
        sales.setId(3);
        sales.setPiece(size);
        sales.setProvider("Okan Cetin");
        sales.setSaleDate("18.02.2017");
        result.add(sales);

        Sales sales2 = new Sales();
        sales2.setId(3);
        sales2.setPiece(size);
        sales2.setProvider("Ali Veli");
        sales2.setSaleDate("05.01.2017");
        result.add(sales2);

        List<Sales> salesFromDB = salesDAO.findBySize(size);

        if(salesFromDB !=null){
            System.out.println(" DB results are not null");
            logger.info("DB results are not null "+salesFromDB.size());
            return salesFromDB;
        }

        logger.info("Exiting findBySize with param size : "+size);
        return result;
    }

    @Override
    public List<Sales> findAllSales() {
        return null;
    }
}
