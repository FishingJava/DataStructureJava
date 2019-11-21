package com.hackerRank;


public class LeftRotation {

	public static void main(String[] args) {
		//method call
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        leftRotate(arr, 2, 7); 
        printArrayInConsole(arr, 7);
		
	}
	private static void leftRotate(int [] arr, int d, int n) {
		for (int i=0;i<d; i++) {
			rotateArrayByOne(arr, n);
		}
	}
	private static void rotateArrayByOne(int [] arr, int n) {
		
		int i, temp;
		temp = arr[0];
		for(i=0; i<n-1; i++) {
			arr[i] = arr[i + 1];
			
		}
		arr[i] = temp;
	}
	static void printArrayInConsole(int [] arr, int n) {
		for (int i=0; i<arr.length; i++) { 
			System.out.print(arr[i] + " ");
			
		}
		
	}

}
