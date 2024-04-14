package com.org;

public class StrongnoRange {
	public static void main(String[] args) {
		int lower = 1;
		int upper = 200;

		for (int i = lower; i < upper; i++) {

			if (isStrong(i)) {
				System.out.println(i);
			}

		}
	}

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static boolean isStrong(int num) {
		int n=num;
		int c=n;
		int rem ,sum=0;
		while(n!=0) {
			rem=n%10;
			sum+=fact(rem);
			n=n/10;
			
		}
		if(c==sum) {
			return true;
		}
		return false;

	}
}
