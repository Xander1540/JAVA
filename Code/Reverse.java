
import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int rev=0;
		while(a>0){
			rev=a%10;
			a=a/10;
			System.out.print(rev);
		}
	}
	
}