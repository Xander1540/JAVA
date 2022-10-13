import java.util.Scanner;
import java.util.Arrays;

public class Array_reverse{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= input.nextInt();
		}
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Reversed Array");
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int[] arr){
		int start =0;
		int end = arr.length-1;

		while(start<end){
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int start, int end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
