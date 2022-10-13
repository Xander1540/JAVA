import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
	/*	int[][] arr2D = {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
	*/
	
		System.out.println("Input");
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]= input.nextInt();
			}
		}

		System.out.println("Output");
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		/* Another way to give output ->
			for(int i=0; i<arr.length; i++){
				System.out.println(Arrays.toString(arr[i]));
			}
		*/

		/* Another way to give output ->
			for(int[] a: arr){
				System.out.println(Arrays.toString(a));
			}
		*/
	}
}