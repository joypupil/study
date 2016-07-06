package com.joypupil.study.test.序列化;

import java.io.Serializable;

public class TestSerializable implements Serializable {
	
	private String testA;
	
	private String testB;

	public String getTestA() {
		return testA;
	}

	public void setTestA(String testA) {
		this.testA = testA;
	}

	public String getTestB() {
		return testB;
	}

	public void setTestB(String testB) {
		this.testB = testB;
	}

}
