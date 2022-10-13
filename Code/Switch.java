import java.util.Scanner;

public class Switch{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		String fruit= input.next();
		
		switch (fruit){
			case "Mango":
				System.out.println("King of fruits");
				break;
			case "Apple":
				System.out.println("A sweet red fruit");
				break;
			case "Orange":
				System.out.println("Round fruit");
				break;
			case "Grapes":
				System.out.println("Small fruits");
				break;
			default:
				System.out.println("Invalid input");
		}
		
	}
}