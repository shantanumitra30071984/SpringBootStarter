package com.springbootstarter.test.inetrfaces.impls;

import java.util.Arrays;
import java.util.List;

import com.springbootstarter.test.inetrfaces.StudentService;
import com.springbootstarter.test.model.Students;

public class StXaviers implements StudentService {

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		List<Students>xaviers=Arrays.asList(new Students("Joseph","42","VI"),new Students("Jim","4","V"),new Students("Sam","21","X"));

		return xaviers;
	}

}
