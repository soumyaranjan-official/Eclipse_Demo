package com.org;

import java.util.Arrays;

public class MaxArray {
public static void main(String[] args) {
	int [] arr= {25,11,7,75,56};
//	int max=arr[0];
//	for (int i = 1; i < arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//	}
//	System.out.println(max);
//	
	int max=Arrays.stream(arr).max().getAsInt();
	System.out.println(max);
}
}
