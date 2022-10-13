// Sum of 2 no.s and print sum using function

import java.util.Scanner;

public class Function_sum{
	public static void main(String[] args){
		//sum();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a no.: ");
		int n1 = input.nextInt();
		System.out.print("Enter another no.: ");
		int n2 = input.nextInt();
		int ans = sum1(n1,n2);
		System.out.print("Sum = "+ans);
	}
	
	static void sum(){ // void datatype
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a no.: ");
		int n1 = input.nextInt();
		System.out.print("Enter another no.: ");
		int n2 = input.nextInt();
		int sum= n1+n2;
		System.out.print("Sum = "+sum);
	}
	
	static int sum1(int a, int b){ //int datatype and passsing argument to function.
		int sum = a+b;
		return sum;
	}
}