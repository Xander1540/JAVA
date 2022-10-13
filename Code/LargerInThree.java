
import java.util.Scanner;

public class LargerInThree{
	public static void main(String[] args){
		System.out.print("Enter three no.s : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>b && a>c){
			System.out.print("Largest no is "+a);
		}else if(b>a && b>c){
			System.out.print("Largest no is "+b);
		}else{
			System.out.print("Largest no is "+c);
		}
		
		// int max = Math.max(c, Math.max(a,b));
	}

}