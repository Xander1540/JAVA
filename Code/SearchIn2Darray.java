import java.util.*;

public class SearchIn2Darray{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row and col of array: ");
		int n= input.nextInt();
		int m= input.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Enter elements of array: ");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]= input.nextInt();
			}
		}
		
		System.out.print("Enter element to be searched: ");
		int target= input.nextInt();
		
		int[] x= search(arr,target);
		System.out.println("Element "+target+" is at "+(Arrays.toString(x))+" .");
	}
	
	static int[] search(int[][] arr, int target){
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j]==target){
					return new int[]{i, j};
				}
			}
		}
		return new int[]{-1, -1};
	}
}
