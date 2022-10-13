import java.util.Scanner;
import java.util.Arrays;

public class PassingFunction{
	public static void main(String[] args){
		int[] num= {1,2,3,4,5};
		
	System.out.println(Arrays.toString(num));
	
	changes(num);
	
	System.out.println(Arrays.toString(num));
	}

	static void changes(int[] num){
		num[0]=99;
	}
	
}
