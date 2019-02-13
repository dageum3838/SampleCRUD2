package com.example.web02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.web02.vo.Sample;

@Mapper
public interface SampleMapper {

	List<Sample> selectSampleList();
	List<Sample> selectSampleOne(int sampleId);
	int insertSample(String sampleName);
	
}
