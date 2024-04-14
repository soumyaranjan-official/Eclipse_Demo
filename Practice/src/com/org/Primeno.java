package com.org;

import java.util.Iterator;

public class Primeno {
	public static void main(String[] args) {

			int lower=1;
			int upper=20;
			for (int i = lower; i <upper; i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	public static boolean isPrime(int n) {
		
		if(n<2)
		return false;
		
		for (int j = 2; j <n; j++) {
			if(n%j==0) {
				return false;
			}
		}
		return true;
		
	}
}
