package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequecnyOfString {

	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		input.add("David");
		input.add("James");
		input.add("John");
		input.add("James");
		input.add("Fish");
		input.add("David");
		input.add("James");
		input.add("James");
		input.add("John");
		input.add("David");
		Map<String, Integer> ret = new HashMap<String, Integer>();
		Map<String, Integer> result = countFrequencyOfString(input);
		System.out.println("frequency of a string in A List: ");
        // Displaying the HashMap 
        for (Map.Entry<String, Integer> val : result.entrySet()) {
        	System.out.println(val.getKey() + " found  " + val.getValue() + " " + " times.");
        }
        
        String [] stringArray = {"David","James","John", "James", "Fish", "David", "James", "James","John","David"};  	
        Map<String, Integer> resultFromArray = frequencyOfStringInArray(stringArray);
        System.out.println(" ");
        System.out.println("frequency of a string in an array: ");
        for (Map.Entry<String, Integer> val : result.entrySet()) {
        	System.out.println(val.getKey() + " found  " + val.getValue() + " " + " times.");
        }
	}
  private static Map<String, Integer> countFrequencyOfString(List<String> listOfString) {
	  Map<String, Integer> ret = new HashMap<String, Integer>();
	  for (int i = 0; i < listOfString.size(); i++) {
		  String key = listOfString.get(i);
		  Integer count = ret.get(key);
		
		  if (count != null && ret.containsKey(key)){
			  ret.put(key, ++count);
		  } else {
			  ret.put(key, 1);
		  }
	  }
	  return ret;
	  
  }
  //when we are asked to get frequncy of a string from Array 
  private static Map<String, Integer> frequencyOfStringInArray(String[] arr) {
	  
	List<String> temp =  new ArrayList(Arrays.asList(arr)); 
	
	  Map<String, Integer> ret = new HashMap<String, Integer>();
	  for (int i = 0; i < temp.size(); i++) {
		  String key = temp.get(i);
		  Integer count = ret.get(key);
		
		  if (count != null && ret.containsKey(key)){
			  ret.put(key, ++count);
		  } else {
			  ret.put(key, 1);
		  }
	  }
	  return ret;
	  
  }
}
