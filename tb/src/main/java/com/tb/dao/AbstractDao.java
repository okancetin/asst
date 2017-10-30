package com.tb.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by okancetin on 30/10/17.
 */
abstract public class AbstractDao {
    final protected JdbcTemplate jdbcTemplate;

    protected AbstractDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}