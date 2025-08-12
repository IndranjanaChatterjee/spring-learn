package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class SpringLearnApplication {
    private final Logger logger= LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);
        SpringLearnApplication app=new SpringLearnApplication();
        app.displayDate();
        app.displayCountry();
        app.displayCountries();
	}

    private void displayCountries() {
        logger.info("display Countries");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        logger.debug("Country : {}", country);
        // Demonstrate singleton scope - two retrievals
        Country another = context.getBean("country", Country.class);
        logger.debug("country == another ? {}", country == another);
        ((ClassPathXmlApplicationContext) context).close();
        logger.info("END displayCountry()");
    }

    private void displayCountry() {

        logger.info("START displayCountries()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        logger.debug("Country list: {}", countryList);
        ((ClassPathXmlApplicationContext) context).close();
        logger.info("END displayCountries()");
    }

    private void displayDate() {
        logger.info("Display Date");
        ApplicationContext context=new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format=context.getBean("dateFormat",SimpleDateFormat.class);
        try {
            Date date = format.parse("31/12/2018");
            logger.debug("Parsed date = {}", date);
        } catch (ParseException e) {
            logger.error("Date parse failed", e);
        }
        logger.info("END displayDate()");
        // If you opened ClassPathXmlApplicationContext, you can close it if desired:
        if (context instanceof ClassPathXmlApplicationContext) {
            ((ClassPathXmlApplicationContext) context).close();
        }
    }

}
