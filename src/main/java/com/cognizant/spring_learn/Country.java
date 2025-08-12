package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Country {

    private static final Logger logger= LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;
    public Country() {
        logger.info("Inside Country Constructor.");
    }
    public Country(String code) {
        logger.info("Inside Country.class");
        this.code = code;
    }

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
