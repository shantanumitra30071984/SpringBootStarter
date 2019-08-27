package com.springbootstarter.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootstarter.test.inetrfaces.StudentService;
import com.springbootstarter.test.model.Students;

/**
 * @author Shantanu Mitra
 *
 */

/**
 * This controller takes two urls and based on the urls it calls the relevant methods
 * **/
@RestController
@RequestMapping("/springbootstarter")

public class StudentController {
	@Autowired
	@Qualifier("deNobiliStudents")
	StudentService deNobiliStudents;
	@RequestMapping("/deNobili/allStudents")
	public List<Students>getAllNobilianStudents(){
		return deNobiliStudents.getAllStudents();
	}
	
	
	/** The st xaviers. */
	@Autowired
	@Qualifier("stXaviers")
	StudentService stXaviers;
	@RequestMapping("/xaviers/allStudents")
	
	
	
	public List<Students>getAllXaviersStudent(){
		return stXaviers.getAllStudents();
	}
	
}
