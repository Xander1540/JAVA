import java.util.*;

public class IntersectionOfArray{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int x= input.nextInt();
		int[] arr1= new int[x];
		int[] arr2= new int[x];
		
		int i=0,j=0;
		System.out.print("Enter elements of 1st array: ");
		for(i=1; i<x; i++){
			arr1[i]= input.nextInt();
		}
		
		System.out.print("Enter elements of 2st array: ");
		for(j=1; j<x; j++){
			arr2[j]= input.nextInt();
		}
		
		System.out.print("Intersection of two array is: ");
		while(i < x && j < x){
         if(arr1[i] < arr2[j]){
            i++;
		 }
         else if(arr2[j] < arr1[i]){
            j++;
		 }
         else{
            System.out.print(arr2[j]+" ");
            i++;
			j++;
         }
      }
	}
}
