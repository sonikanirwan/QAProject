package java_package;
import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Taking input from user");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number 1");
	  int a = sc.nextInt();
	  System.out.println("Enter number 2");
	  int b = sc.nextInt();
	  int sum = a+b;
	  System.out.println("The sum of these number is");
	  System.out.println(sum);
	
	
	
	
	}

}
