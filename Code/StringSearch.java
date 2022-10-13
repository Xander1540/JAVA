import java.util.*;

public class StringSearch{
	static char a;
	static int x;
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s= input.nextLine();
		System.out.print("Enter character to search: ");
		char c= input.next().charAt(0);
		search(s,c);
		System.out.print("The character "+c+" is at "+x);
	}

	static void search(String s, char c){
		if(s.length()==0){
			System.out.println("Fuck off");
		}

		for(int i=0; i<s.length(); i++){
			if(c== s.charAt(i)){
				a= s.charAt(i);
				x=i;
			}
		}
	}
	
}
