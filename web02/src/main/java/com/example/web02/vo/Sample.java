package com.example.web02.vo;

public class Sample {
	private int sampleId;	//sample.sample_id
	private String sampleName;	//sample.sample_name
	
	public String getSampleName() {
		return sampleName;
	}
	
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	
	public int getSampleId() {
		return sampleId;
	}
	
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", getSampleName()=" + getSampleName()
				+ ", getSampleId()=" + getSampleId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
