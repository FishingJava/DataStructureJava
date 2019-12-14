package com.interview;

public class reversString {

	public static void main(String[] args) {
		System.out.println(reverseWord(" deserver"));
		System.out.println(reverseUsingjavaApi("desrever"));
		String[] result = reverseStatement("won m'I  desrever kcab");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
private static String reverseWord(String word) {
	StringBuilder builder = new StringBuilder();
	for(int i = 1; i <= word.length(); i++) {
		char  c = word.charAt(word.length() - i);
		builder.append(c);
	}
	
	return builder.toString();
}
 private static String[] reverseStatement(String statment) {
	 String [] arr = statment.split(" ");
	 String [] ret = new String [arr.length];
	 for(int i = 0; i < arr.length; i ++) {
		 String revString = reverseWord(arr[i]);
		 ret[i] = revString;
	 }
	  
	 return ret;
	 
 }
 
 private static String reverseUsingjavaApi(String str) {
	//short way of reversing a string using java Api
		String reversed = new StringBuilder(str).reverse().toString();
	 
		return reversed;
 }
}
