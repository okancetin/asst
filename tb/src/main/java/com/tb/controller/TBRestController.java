package com.tb.controller;

import com.tb.model.Sales;
import com.tb.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by okancetin on 29/10/17.
 */

@RestController
public class TBRestController {

    @Autowired
    SalesService salesService;

    @RequestMapping(value = "/sales/{size}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Sales>> getSalesList(@PathVariable("size") Integer size) {

        System.out.println("Retrieve Sales result with size =" + size);

        List<Sales> salesList = salesService.findBySize(size);
        if (salesList == null) {
            System.out.println(" " + size + " not found");
            return new ResponseEntity<List<Sales>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Sales>>(salesList, HttpStatus.OK);
    }

}
