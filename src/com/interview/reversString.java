package com.interview;

public class reversString {

	public static void main(String[] args) {
		System.out.println(reverseWord("Gashaw"));
		String[] result = reverseStatement("the quick brown fox jumps over the laze dog");
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
//	System.out.print(builder.toString());
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
}
