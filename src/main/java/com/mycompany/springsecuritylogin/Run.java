/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsecuritylogin;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author root
 */
@SpringBootApplication
public class Run {
   
    public static void main(String[] args){
       SpringApplication.run(Run.class, args);
    }
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://" + "localhost:" + "5432/" + "springsecurity" + "?autoReconnect=true");
        dataSource.setUsername("postgres");
        dataSource.setPassword("12692444");
        return dataSource;
    }
    
}
