// O(logm + logn)
import java.util.*;
public class BS_2DArray{
	public static void main(String[] argv){
		int[][] matrix={
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a target no between 1-9: ");
		int target= input.nextInt();
		System.out.print(Arrays.toString(search(arr,target)));
	}

	static binarySearch(int[] matrix, int row, int cStart, int cEnd, int target){
		while(cStart<cEnd){
			int mid= cStart + (cEnd-cStart)/2;
			if(arr[mid]<target){
				cStart= mid+1;
			}else if(arr[mid]>target){
				cEnd= mid--;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	static int[] search(int[][] matrix, int target){
		int rows= matrix.length;
		int cols= matrix[0].length;
		
		if(rows==1){
			return binarySearch(matrix, 0,0,col-1,target);
		}
		
		// perform binary search on middle column.
		// run the loop till 2 loops are remaining.
		int rStart=0;
		int rEnd= rows-1;
		int cMid= cols/2;
		
		while(rStart< (rEnd-1)){
			int mid= rStart+ (rEnd-rStart)/2;
			if(matrix[mid[cMid]] == target){
				return new int[] {mid, cMid};
			}
			if(matrix[mid[cMid]] < target){
				rStart=mid;
			}else{
				rEnd=mid;
			}
		}
		
		//now we have 2 rows
		
		// check whether target is in the column of 2 rows
		
		if(matrix[rStart][cMid]==target){
			return new int[] {rStart, cMid};
		}
		if(matrix[rStart+1][cMid]==target){
			return new int[] {rStart+1, cMid};
		}
		
		//serach in 1st half
		if(target<= matrix[rStart][cMid-1]){
			return binarySearch(matrix, rStart, 0, cMid-1, target);
		}
		//serach in 2nd half
		if(target>= matrix[rStart][cMid+1] && target<= matrix[rStart][cols-1]){
			return binarySearch(matrix, rStart, cMid+1, cols-1, target);
		}
		//serach in 3rd half
		if(target>= matrix[rStart+1][cMid-1]){
			return binarySearch(matrix, rStart+1, 0, cMid-1, target);
		}else{			//serach in 4th half
			return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
		}
		
	}
}