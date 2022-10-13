import java.util.*;

public class BS_NextGreatestLetter{
	public static void main(String[] args){
		char[] arr={'c','f','j'};
		Scanner input= new Scanner(System.in);
		System.out.print("Enter target: ");
		char target= input.next().charAt(0);
		char ans=search(arr,target);
		System.out.print(target+" is at index "+ans);
	}

	static char search(char[] arr, char target){
		int start=0;
		int end= arr.length-1;
		
		while(start<=end){
			int mid  = start+ (end-start)/2;
			if(target< arr[mid]){
				end= mid-1;
			}else{
				start = mid+1;
			}
		}
		return arr[start%arr.length]; // OG way of coding.
	}
}
