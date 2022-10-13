import java.util.Scanner;

public class Switch_new{
	public static void  main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		switch (s){
			case "A" -> System.out.println("a");
			case "B" -> System.out.println("b");
			case "C" -> System.out.println("c");
			case "D" -> System.out.println("d");
			default ->  System.out.println("Fuck off");
		}
	}
}