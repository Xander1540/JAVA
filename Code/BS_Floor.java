import java.util.*;

public class BS_Floor{
	public static void main(String[] args){
		int[] arr={2, 3, 5, 9, 14, 16, 18};
		Scanner input= new Scanner(System.in);
		System.out.print("Enter target: ");
		int target= input.nextInt();
		int ans=search(arr,target);
		System.out.print(target+" is at index "+ans);
	}
	
	static int search(int[] arr, int target){
		int start=0;
		int end= arr.length-1;
		
		while(start<=end){
			int mid  = start+ (end-start)/2;
			if(target< arr[mid]){
				end= mid-1;
			}else if(target > arr[mid]){
				start = mid+1;
			}else{
				return mid;
			}
		}
		return end; // OG way of coding.
	}
}
