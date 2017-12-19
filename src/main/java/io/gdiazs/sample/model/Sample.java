package io.gdiazs.sample.model;

import java.util.Date;

public class Sample {

	private Integer id;
	
	private String sampleName;
	
	private Date sampleCretedAt;
	
	
	

	public Sample(Integer id, String sampleName, Date sampleCretedAt) {
		super();
		this.id = id;
		this.sampleName = sampleName;
		this.sampleCretedAt = sampleCretedAt;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public Date getSampleCretedAt() {
		return sampleCretedAt;
	}

	public void setSampleCretedAt(Date sampleCretedAt) {
		this.sampleCretedAt = sampleCretedAt;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		return "Sample [id=" + id + ", sampleName=" + sampleName + ", sampleCretedAt=" + sampleCretedAt + "]";
	}



	
	

}
