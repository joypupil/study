package com.joypupil.study.design_pattern.template_method;

public class Client {

	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		//调用模板方法
		class1.templateMehtod();
		class2.templateMehtod();
	}

}
