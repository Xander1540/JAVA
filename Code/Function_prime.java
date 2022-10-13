import java.util.Scanner;
import java.lang.Math;

public class Function_prime{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		prime(a);
	}
	
	static void prime(int a){
		int count=0;
		for(int i=1; i<=Math.sqrt(a); i++){
			if(a%i==0)
				count++;
		}
		if(count<2){
			System.out.print(a+" is prime");
		}else{
			System.out.print(a+" is not prime");
		}
	}
	
}