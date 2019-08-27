package com.springbootstarter.test.inetrfaces.impls;

import java.util.Arrays;
import java.util.List;

import com.springbootstarter.test.inetrfaces.StudentService;
import com.springbootstarter.test.model.Students;

public class DeNobiliStudents implements StudentService {

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		List<Students>deNobiliStudents=Arrays.asList(new Students("Ram","42","VI"),new Students("Bharat","4","V"),new Students("Mohan","21","X"));
		return deNobiliStudents;
	}

}
