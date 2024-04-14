package com.org;
interface A
{
	void m1();
}
interface B
{
	int m1();
}
public class Test implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hii");
	}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}



}
