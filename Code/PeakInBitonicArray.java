import java.util.*;

public class PeakInBitonicArray{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,7,1};
		int x=binarySearch(arr);
		System.out.println(arr[x]);
	}
	
	static int binarySearch(int[] arr){
		int start=0;
		int end=arr.length-1;
	
		while(start<=end){
			int mid=start+ (end-start)/2;

		//	if(arr.length%2==0){
				if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
					return mid;
				}else if(arr[mid+1]>arr[mid-1] && arr[mid+1]>arr[mid]){
					return mid+1;
				}else{
					return mid-1;
				}
		//	}
			/*else{
				if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
					return mid;
				}else if(arr[mid+1]>arr[mid-1] && arr[mid+1]>arr[mid]){
					return mid+1;
				}else{
					return mid-1;
				}
			}*/
		}
		return -1;
	}
}
