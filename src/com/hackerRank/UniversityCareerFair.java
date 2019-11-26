package com.hackerRank;

public class UniversityCareerFair {

	public static void main(String[] args) {
		int [] arrivals = {1,3,3,5,7};
		int [] durations = {2,2,1,2,1};  
		System.out.println(MaxcareerFair(arrivals, durations));
	}
	
 public static int MaxcareerFair(int [] arrivals, int [] durations) {
	 int ret = 0;
	 for(int arrival =0; arrival > arrivals.length; arrival++) {
		 for (int duration = 0; duration > durations.length; duration++) {
			  int halloccupied = arrivals[arrival] + durations[duration];
			  if(halloccupied <= durations[duration]) {
				ret+=1; 
			 }
				 
			 }
		 }
	 
	 return ret;
 }
}
