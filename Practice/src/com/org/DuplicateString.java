package com.org;

import java.util.Iterator;

public class DuplicateString {
public static void main(String[] args) {
	String str="Great responsibility";
	int count=;
	char[] str1=str.toCharArray();
	for (int i = 0; i < str1.length; i++) {
		for (int j = i+1; j < str1.length; j++) {
			if(str1[i]==str1[j] && str1[i]!=' ') {
				count++;
				str1[j]='0';
			}
		}
		if(count>1 && str1[i]!='0')
		{
			System.out.println(str1[i]);
		}
	}
}
}
