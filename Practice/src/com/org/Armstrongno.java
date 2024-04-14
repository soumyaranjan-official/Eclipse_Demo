package com.org;

public class Armstrongno {
public static void main(String[] args) {
	 int n=151;
	 int c=n;
	 int r,arm=0;
	 while(n!=0) {
		 r=n%10;
		 arm=(r*r*r)+arm;
		 n=n/10;
	 }
	 if(c==arm) {
		 System.out.println("arm no");
	 }
	 else
	 {
		 System.out.println("not a arm no");
	 }
}
}
