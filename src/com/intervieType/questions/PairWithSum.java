package com.intervieType.questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PairWithSum {

	public static void main(String[] args) {
		int [] arr = {17,6,4,-5,8,7,9};
		int sum = 12;
        HashMap<Integer, Integer> result =  pairSum(arr, sum);
        
        Iterator<Map.Entry<Integer, Integer>> itr = result.entrySet().iterator();
        
        while(itr.hasNext()) {
        	Map.Entry<Integer, Integer> entry = itr.next();
        	   System.out.print("( " + entry.getKey() + ", " + entry.getValue() + ") ");    	
       
	}
	}
	public static HashMap<Integer, Integer> pairSum(int [] arr, int sum) {
		HashMap<Integer, Integer> ret = new HashMap<>();
		
		for(int i = 0; i< arr.length; i++) {
		   for (int j = 1; j<arr.length; j++) {	
			if(arr[i] + arr[j] == sum) {
				ret.put(arr[i], arr[j]);
			}
		   }
		} 
		return ret;
	  
	 }
}
