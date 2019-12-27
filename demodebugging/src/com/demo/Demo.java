package com.demo;
class Foo {
	private static Foo foo=new Foo();
	public Foo() {
		System.out.println("ctr of foo");
	}
	public void doWork() {
		System.out.println("doing work");
	}
}

public class Demo {
	public static void main(final String[] args) {
		Foo f = new Foo();
		f.doWork();
	}

}
