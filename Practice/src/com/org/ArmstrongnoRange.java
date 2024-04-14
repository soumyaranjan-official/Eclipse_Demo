package com.org;

public class ArmstrongnoRange {
public static void main(String[] args) {
	
	int lower=1;
	int upper=500;
	for (int i = lower; i <=upper; i++) {
		int n=i;
		int r=0;
		int arm=0;
		while(n!=0) {
			r=n%10;
			arm+=r*r*r;
			n=n/10;
		}
		
		if(i==arm) {
			System.out.println(i);
		}
	}
}
}
