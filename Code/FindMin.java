import java.util.*;

public class FindMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n= input.nextInt();
		
		int[] arr= new int[n];
		System.out.print("Enter elements of array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		int x=min(arr);
		System.out.print("Minimum: "+x);
	}
	
	static int min(int[] arr){
		int min= arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
}
