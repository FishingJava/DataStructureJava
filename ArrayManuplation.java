package com.practice;

import java.util.Arrays;
import java.util.List;

public class ArrayManuplation {
	
	public static void main(String [] args) { 
		Integer [] myarray = {1,2,100,5,6,7};
		List<Integer> myList = Arrays.asList(myarray);
		System.out.println(maxDifference(myList));
	}
	
	private static int maxDifference(List<Integer> arr) {
		if(arr.size()<2) {
			//for special conditions 
			return 0;
		}
		int max = arr.get(0);
		int min = arr.get(0);
		for(int i=0; i<arr.size(); i++) {
				if(arr.get(i)> max) {
				   max= arr.get(i);
				}
				if(arr.get(i)< min) {
					min = arr.get(i);
					
			}
			
		}
		return max-min;
		
	}

}
