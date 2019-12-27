package com.demo;

public class DemoLoop {
	public static void main(String[] args) {
	
		int j=process();
		
		System.out.println("j:"+j);
		
		j=process();
		System.out.println(j);
	}

	public static int process(){
		int j=0;
		int i=0;
		for( i=0;i<10; i++){
			j+=i;
		}
		return j;
	}
}
