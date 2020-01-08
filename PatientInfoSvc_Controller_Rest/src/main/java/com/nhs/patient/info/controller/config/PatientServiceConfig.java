/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.controller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Anil Aug 22, 2019
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.nhs.patient.info")
public class PatientServiceConfig {

	public MappingJackson2HttpMessageConverter converter(){
		return new MappingJackson2HttpMessageConverter();
	}
}
