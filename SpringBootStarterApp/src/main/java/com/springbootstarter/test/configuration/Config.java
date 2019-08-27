package com.springbootstarter.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springbootstarter.test.inetrfaces.StudentService;
import com.springbootstarter.test.inetrfaces.impls.DeNobiliStudents;
import com.springbootstarter.test.inetrfaces.impls.StXaviers;

@Configuration
@ComponentScan(basePackages= {"com.springbootstarter.test.controller"})
public class Config {
	@Bean(name="deNobiliStudents")
	StudentService getStudentServiceNobilians() {
		return new DeNobiliStudents();
	}
	
	@Bean(name="stXaviers")
	StudentService getStudentServiceXaviers() {
		return new StXaviers();
	}

}
