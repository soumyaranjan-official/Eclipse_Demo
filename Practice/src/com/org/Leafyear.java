
package com.org;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2000;
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("not a leap year");
		}
	}

}
