import java.util.Scanner;
import java.util.Arrays;

public class VariableLengthArguments{
	public static void main(String[] args){
		fun(2,3,4,5,6,7,8,9);
	}
	
	// fun(2, 3, "Aditya", "Thermo", "Parth");
	//static void fun(int a, int b, String ...v)
	
	static void fun(int ...v){
		System.out.print(Arrays.toString(v));
	}
}