import java.util.*;

public class LinearSearch{

	public static int a;
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = input.nextInt();
		int[] arr= new int[n]; 
		System.out.println("Enter elements of array: ");
		for(int i=0; i<n; i++){
			arr[i] =input.nextInt();
		}
		System.out.println("Enter element to be searched: ");
		int element= input.nextInt();
		int ans= linear(arr,element);
		System.out.println("The element "+ a +" is on: " + ans + " index.");
	}

	static int linear(int[] arr, int element){
		if(arr.length==0){
			return -1;
		}
		for(int i=0; i<arr.length; i++){
			if(element==arr[i]){
				a=element;
				return i;
			}
		}
		return -1;
	}
}