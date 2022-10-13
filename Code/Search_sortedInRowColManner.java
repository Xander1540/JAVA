// row zero and column last
// [0][arr.length]
// array is sorted in row wise and column wise manner.
import java.util.*;
public class Search_sortedInRowColManner{
	public static void main(String[] argv){
		Scanner input = new Scanner(System.in);
		int[][] arr= {{10, 20, 30,},
					  {40, 50, 60},
					  {70, 80, 90}};

		System.out.print("Enter target: ");
		int target= input.nextInt();
		int[] ans=search(arr,target);
		System.out.print("Target is at: "+Arrays.toString(ans));
	}
	
	static int[] search(int[][] arr, int target){
		int r=0;
		int c=arr.length-1;
		
		while(r<arr.length && c>=0){
			if(arr[r][c]==target){
				return new int[] {r,c};
			}else if(arr[r][c]<target){
				r++;
			}else{
				c--;
			}
		}
		return new int[] {-1,-1};
	}
}