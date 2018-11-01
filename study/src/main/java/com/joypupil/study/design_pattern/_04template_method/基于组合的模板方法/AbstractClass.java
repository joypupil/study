package com.joypupil.study.design_pattern._04template_method.基于组合的模板方法;

public class AbstractClass {
	
	private void doSomething(){
		//业务逻辑处理
		System.out.println("操作数据库准备工作");
	}
	
	private void doAnything(){
		//业务逻辑处理
		System.out.println("操作数据库结束工作");
	}
	
	//模板方法(有时候为了防止恶意的操作，会将模板方法用final修饰)
	public final void templateMehtod(MyCallBack call){
		this.doAnything();
		call.doInTemplate();
		this.doSomething();
		
	}
	
	public void add(final int i){
		templateMehtod(new MyCallBack(){

			@Override
			public void doInTemplate() {
				System.out.println("做增加操作" + i);
			}
			
		});
	}
	
	public void delete(final int i){
		templateMehtod(new MyCallBack(){

			@Override
			public void doInTemplate() {
				System.out.println("做删除操作" + i);
			}
			
		});
	}
	
}
