package com.dov.springbootdebut.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/***
 * This class with its methods enables overriding spring configuration set in application.properties file
 * But i prefer the file way of doing it
 */
@Configuration
public class PersistenceConfiguration {


    // Just an working example that i will comment cause i do not need it
    /*
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        return builder.build();
    }*/
}
