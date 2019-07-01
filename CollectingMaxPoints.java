package com.practice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectingMaxPoints {
	
	public static void main(String [] args) { 
		Integer [] myarray = {9,8,10};
		List<Integer> myList = Arrays.asList(myarray);
		System.out.println(collectMax(myList));
	}
	
 private static int collectMax(List<Integer> arr) {
	 int ret = 0;
	 Collections.sort(arr,Collections.reverseOrder());
	 for( int i=0;i <arr.size()-1; i++) {
		 int current = arr.get(i);
		
       if(current+1 == arr.get(i+1)) { 
    	   i++;
		 continue;
	   } else {
		   ret+=current;
	   }
	 }
	// if(arr.get(arr.size()-2)-1 != arr.get(arr.size()-1)) {
    //    ret+=arr.get(arr.size()-1);
	// }
	return ret;
	 
   }
}