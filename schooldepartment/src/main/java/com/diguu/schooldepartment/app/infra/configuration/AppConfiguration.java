package com.diguu.schooldepartment.app.infra.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class AppConfiguration {

    @Autowired
    private Environment env;

    private static final String URL = "spring.datasource.url";
    private static final String USERNAME = "spring.datasource.username";
    private static final String PASSWORD = "spring.datasource.password";
    private static final String DRIVER_CLASS_NAME = "spring.datasource.driverClassName";

    @Bean
    public DataSource getDataSource() {
        var source = new DriverManagerDataSource();

        source.setUrl(env.getProperty(URL));
        source.setUsername(env.getProperty(USERNAME));
        source.setPassword(env.getProperty(PASSWORD));
        source.setDriverClassName(env.getRequiredProperty(DRIVER_CLASS_NAME));

        return source;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean configureEntityManagerFactory() {
        var entityManager = new LocalContainerEntityManagerFactoryBean();

        entityManager.setDataSource(getDataSource());
        entityManager.setPackagesToScan("com.*");
        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        return entityManager;
    }

}
