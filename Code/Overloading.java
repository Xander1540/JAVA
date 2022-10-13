import java.util.Scanner;


// two functions with same name an exist if we pass diffrent types of arguments.
// same datatype arguments but diffrent no. of parameters.
// function overloading occurs at compile time.


public class Overloading{
	public static void main(String[] args){
		func(1);
		func("Aditya Narayan Verma");
	}
	
	static void func(int a){
		System.out.println(a);
	}
	
	static void func(String n){
		System.out.print(n);
	}
	
}