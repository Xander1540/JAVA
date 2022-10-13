// worst case= O(logN)
// best case O(1)

import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = input.nextInt();
		System.out.print("Enter elements of array: ");
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= input.nextInt();
		}
		System.out.print("Enter target: ");
		int target = input.nextInt();
		int ans= search(arr,target);
		System.out.print(target+" is at index "+ans);
	}

	static int search(int[] arr, int target){
		int start=0;
		int end= arr.length-1;
		
		while(start<=end){
			int mid  = start+ (end-start)/2; // might be possible that (srart+end) exceeds the range of int.
			if(target< arr[mid]){
				end= mid-1;
			}else if(target > arr[mid]){
				start = mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
 