package com.org;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="Race";
	String str2="Care";
//	char [] ch1=str1.toLowerCase().toCharArray();
//	char [] ch2=str2.toLowerCase().toCharArray();
//	if(ch1.length!=ch2.length) {
//	System.out.println("not a anagram");
//	}
//	else
//	{
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		boolean status = Arrays.equals(ch1, ch2);
//		if(status) {
//			System.out.println("anagram");
//		}
//		else
//		System.out.println("not anagram");
//		
//	}
	if(isAnagram("Race", "Carm"))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("not Anagram");
	}
}
public static boolean isAnagram(String  str1,String str2) {
	char [] ch1=str1.toLowerCase().toCharArray();
	char [] ch2=str2.toLowerCase().toCharArray();
	if(ch1.length!=ch2.length) {
		return false;
	}
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	boolean status = Arrays.equals(ch1, ch2);

return status;

}
}