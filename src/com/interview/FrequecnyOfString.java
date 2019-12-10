package com.interview;

import java.util.ArrayList;
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
		
		// Displaying the HashMap 
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
}
