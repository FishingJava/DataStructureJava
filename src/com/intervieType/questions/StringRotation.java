package com.intervieType.questions;

public class StringRotation {
	
	public static void main(String [] args) {
		String input = "waterbottle";
		String sub = "er";
		System.out.println(isSubstring(input, sub));
		
	}

	public static boolean isSubstring(String str1, String str2) {
		if(str1.indexOf(str2) != -1) {
			int startIndex = str1.indexOf(str2);
		    String result = str1.substring(startIndex) + str1.substring(0,startIndex);
		    System.out.println(result);
		    return true;
		}
		
		return false;
	}
}
