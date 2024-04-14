package com.org;

import java.util.Arrays;

public class MinArray {
public static void main(String[] args) {
	
	int [] arr= {10,54,78,63,2,5,1};
//	int min=arr[0];
//	for (int i = 0; i < arr.length; i++) {
//		if(arr[i]<min) {
//			min=arr[i];
//		}
//	}
	int min=Arrays.stream(arr).min().getAsInt();
	System.out.println(min);
}
}
