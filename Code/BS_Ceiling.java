import java.util.*;

public class BS_Ceiling{
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
			int mid  = start+ (end-start)/2; // might be possible that (srart+end) exceeds the range of int.
			if(target< arr[mid]){
				end= mid-1;
			}else if(target > arr[mid]){
				start = mid+1;
			}else{
				return mid;
			}
		}
		return start; // OG way of coding.
	}
}

/*
	static boolean check(int[] arr, int target){
		for(int i=0; i<arr.length; i++){
			if(target==arr[i]){
				return true;
			}else{
				return false;
			}
		}
	}
*/



/*
	static int search(int[] arr, int target){
		int start=0;
		int end= arr.length-1;

	int flag=0;
	for(int i=0; i<arr.length; i++){ 
		if(target==arr[i]){
			flag=1;
		}
	}
  
	if(flag==1){
		while(start<=end){
			int mid = start+ (end-start)/2;
			if(target<arr[mid]){
				end=mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}else{
				return mid;
			}
		}
	}else{
		while(start<=end){
			int mid = start+ (end-start)/2;
			
			for(int i=0; i<arr.length; i++){
				if(target<arr[i]){
					target= arr[i];
				}
			}

			if(target<arr[mid]){
				end=mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}else{
				return mid;
			}
		}
	}
		return -1;
	}
*/

/*
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
*/