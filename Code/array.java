  // syntax
  // datatype[] variable_name = new datatype[size];
  // int[] roll = new int[5];
  
// array objects are in heap.
// heap subjects are not continuous. depends upon JVM
// dynamic memory allocation.

import java.util.Scanner;	

public class array{

	public static void main(String[] args){
	
	// array of primitives
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int[] arr = new int[a];
	
	for(int i=0; i<arr.length; i++){
		arr[i] = input.nextInt();
	}

	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+ " ");
	}
	
	/*
	a diffrent way for output.
	System.out.println(Arrays.toString(arr));
	*/


	/*
	FOR EACH LOOP
	for(datatype ref_variable : array){ // for every element in array print the element.
		System.out.print(ref_variable); // here num represents element of an array.
	}
	
	for(int num : arr){
		System.out.print(num + " ");
	}
	*/
	
	
	
	// Array of objectss
	
	/*
	String[] str = new String[4];
	for(int i=0; i<str.length; i++{
		str[i]= input.next();
	}
	
	System.out.println(Arrays.toString(str));
	*/
	
	}
	
}