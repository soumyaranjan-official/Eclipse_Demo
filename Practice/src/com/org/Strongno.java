package com.org;

public class Strongno {
public static void main(String[] args) {
		int n=145;
		int c=n;
		int r=0;
		int sum=0;
		while(c!=0) {
			r=c%10;
			int fact=1;
			for (int i = 1; i<=r; i++) {
				fact=fact*i;
			}
			sum+=fact;
			c=c/10;
		}
	if(n==sum) {
		System.out.println("strong no");
	}
	else
	{
		System.out.println("not a strong no");
	}
	
	
}
}
