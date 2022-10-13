import java.util.*;

public class BS_FirstAndLastPosition{

	public static void main(String[] args){
		int[] arr={2, 3, 5, 9, 9, 16, 18};
		Scanner input= new Scanner(System.in);
		System.out.print("Enter target: ");
		int target= input.nextInt();
		
		BS_FirstAndLastPosition t= new BS_FirstAndLastPosition();
		
		int a[] = t.searchRange(arr,target);
		System.out.println(a);
	}

	public int[] searchRange(int[] arr, int target){
		int[] ans={-1,-1};
		int start= search(arr,target,true);
		int end= search(arr,target,false);
		
		ans[0]=start;
		ans[1]=end;
		return ans;
	} 

	int search(int[] arr, int target, boolean findStartIndex){
		int ans= -1;
		int start=0;
		int end= arr.length-1;
		
		while(start<=end){
			int mid  = start+ (end-start)/2;
			if(target< arr[mid]){
				end= mid-1;
			}else if(target > arr[mid]){
				start = mid+1;
			}else{ // if(target==mid)
				ans=mid;
				if(findStartIndex==true){
					end=mid-1;
				}else{
					start=mid+1;
				}
			}
		}
		return ans; // OG way of coding.
	}
}