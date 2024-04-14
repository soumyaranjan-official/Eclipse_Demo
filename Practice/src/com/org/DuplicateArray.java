package com.org;

public class DuplicateArray {
public static void main(String[] args) {
	int[] arr= {10,54,63,85,25,10,96,63};
	int temp=0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				temp=arr[i];
				System.out.println(temp);
				
			}
		}
	}
}
}
