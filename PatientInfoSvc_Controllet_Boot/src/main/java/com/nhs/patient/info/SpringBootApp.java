/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Anil Aug 29, 2019
 */
@SpringBootApplication
public class SpringBootApp extends org.springframework.boot.context.web.SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootApp.class);
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootApp.class, args);
	}

}
