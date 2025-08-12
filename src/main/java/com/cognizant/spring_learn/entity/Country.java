package com.cognizant.spring_learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
public class Country {

    private static final Logger logger= LoggerFactory.getLogger(Country.class);
    @Id
    private String code;
    private String name;



    public String getCode() {
        logger.info("Inside getCode");
        return code;
    }



    public void setCode(String code) {
        logger.info("Inside setCode");
        this.code = code;
    }



    public String getName() {
        logger.info("Inside getName");
        return name;
    }

    public void setName(String name) {
        logger.info("Inside setName");
        this.name = name;
    }

    @Override
    public String toString() {
        logger.info("Inside Country.class");
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
