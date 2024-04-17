package java_package;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a=1/0;
		}
		catch(Exception e)
		{
		System.out.println("Cannot divide by zero");
		}
	}

}
