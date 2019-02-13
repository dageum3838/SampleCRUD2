package com.example.web02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web02.mapper.SampleMapper;
import com.example.web02.vo.Sample;

@Service
public class SampleService {
	
	@Autowired private SampleMapper sampleMapper;
	
	public List<Sample> getSelectList(){
		
		List<Sample> list = sampleMapper.selectSampleList();
		
		return list;
	}
}
