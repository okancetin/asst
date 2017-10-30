package com.tb.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by okancetin on 30/10/17.
 */
@Configuration
public class DaoConfig {

    //TODO Do DaoConfig more efficient way. Do not duplicate the DB Properties.!!!!
    @Bean
    public SalesDAO providesUserDao(@Value("${driverClassName:org.sqlite.JDBC}") String driverClassName,
                                   @Value("${jdbcUrl:jdbc:sqlite://Users//okancetin//Documents//workspace//workspace//TomatoBook.db}") String jdbcUrl,
                                   @Value("${userName:root}") String userName,
                                   @Value("${password:r00t}") String password) {
        return new JdbcSalesDAO(providesDataSource(driverClassName, jdbcUrl, userName, password));
    }

    @Bean(name = "dataSource")
    public DataSource providesDataSource(@Value("${driverClassName:org.sqlite.JDBC}") String driverClassName,
                                         @Value("${jdbcUrl:jdbc:sqlite://Users//okancetin//Documents//workspace//workspace//TomatoBook.db}") String jdbcUrl,
                                         @Value("${userName:root}") String userName,
                                         @Value("${password:r00t}") String password) {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(driverClassName);
        driverManagerDataSource.setUrl(jdbcUrl);
        driverManagerDataSource.setUsername(userName);
        driverManagerDataSource.setPassword(password);
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate providesJdbcTemplate(@Value("${driverClassName:org.sqlite.JDBC}") String driverClassName,
                                             @Value("${jdbcUrl:jdbc:sqlite://Users//okancetin//Documents//workspace//workspace//TomatoBook.db}") String jdbcUrl,
                                             @Value("${userName:root}") String userName,
                                             @Value("${password:r00t}") String password) {
        return new JdbcTemplate(providesDataSource(driverClassName, jdbcUrl, userName, password));
    }

}
