import java.util.*;

public class SearchRange{
	public static int s;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n= input.nextInt();
		
		System.out.println("Enter array elements: ");
		
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i]= input.nextInt();
		}
		
		System.out.println("Enter range: ");
		int start= input.nextInt();
		int end= input.nextInt();
		
		System.out.print("Enter the element to be searched: ");
		int target= input.nextInt();
		int x= search(arr, start, end, target);
		System.out.print("The element "+s+" is at "+x+"nd index.");
	}
	
	static int search(int[] arr, int start, int end, int target){
		if(arr.length==0 || arr.length==1 || arr.length==2){
			return -1;
		}
		
		for(int i=start+1; i<end; i++){
			if(target==arr[i]){
				s= target;
				return i;
			}	
		}
		return -1;
	}
}