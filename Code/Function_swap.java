import java.util.Scanner;

public class Function_swap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a= ");
		int x= input.nextInt();
		System.out.print("Enter b= ");
		int y= input.nextInt();
		swap(x,y);
	}
	
	static void swap(int a, int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.print("a= "+a+" b= "+b);
	}
}