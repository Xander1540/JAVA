
import java.util.Scanner;

public class CaseCheck{
	public static void main(String[] args){
		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		// char s = input.next().trim().charAt(0);
		if( c>='A' && c<='Z' ){
			System.out.print("UpperCase");
		}else{
			System.out.print("LowerCase");
		}
	}
}
