package com.joypupil.study.test.thread;


public class memory {
	public static void main(String args[]){
		System.out.println("userage:");
		memory m = new memory();
		long t = m.showUsage();
		System.out.println("Total:" + t + "Bytes");
		long fr = m.freeMemory();
		//System.gc();
		System.out.println("Free:" + fr + "Bytes");
		long rem = t - fr;
		System.out.println("OccupiedSpace:" + rem + "Bytes");
	}
	
	public long showUsage(){
		long l = Runtime.getRuntime().totalMemory();
		return (l);
	}
	
	public long freeMemory(){
		long f = Runtime.getRuntime().freeMemory();
		return f;
	}

}
