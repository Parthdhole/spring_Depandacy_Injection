package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CollegeSeviceImpl implements StudentService{

	@Override
	public String printfees() {
		// TODO Auto-generated method stub
		return "fees of the college is 60k this year";
	}

}
