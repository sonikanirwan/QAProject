package java_package;

public class InheritanceClass implements Registration {

	
	void add(int a ,int b)
	{
		int sum = a+b;
		System.out.println("The sum of two number is "+sum);
	}
	
	void add(int a,double b)
	{
		double sum = a+b;
		System.out.println("The sum of two number is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method overriding 
		College obj= new College();
		obj.nameCollege();
		obj.nameUni();
		obj.department();
		
		// method overloading 
		InheritanceClass obj1= new InheritanceClass();
		obj1.add(100, 200);
		obj1.add(100, 20.20);
		
	}

	@Override
	public void addName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPaymentDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfile() {
		// TODO Auto-generated method stub
		
	}

}


class University
{

	 void nameUni()
	{
		System.out.println("The name of University");
	}
	void department()
	{
		System.out.println("The department in university");
	}
}

class College extends University
{
	void nameCollege()
	{
		System.out.println("The name of College");
	}
	void department()
	{
		System.out.println("The department in cllege ");
	}
}