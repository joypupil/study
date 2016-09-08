package com.joypupil.study.test.枚举类;

public enum TestEnum {
	a("abc"),b("def");
	
	public String param;
	
	private TestEnum(String _param){
		this.param = _param;
	}
	
	@Override
	public String toString(){
		return this.param;
	}

}
