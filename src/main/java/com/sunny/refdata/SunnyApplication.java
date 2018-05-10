package com.sunny.refdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sunny.refdata.RefData;
import com.sunny.refdata.RefDataRepository;

@SpringBootApplication
public class SunnyApplication {
	private static final Logger logger = LoggerFactory.getLogger(SunnyApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SunnyApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner setup(RefDataRepository refDataRepository) {
		return (args) -> {
			refDataRepository.save(new RefData("GOOG", "Alphabet Inc", 1024.38, 2004, "Technology", "Computer Science", "http://www.google.com"));
			logger.info("The sample data has been generated");
		};
	}
}
