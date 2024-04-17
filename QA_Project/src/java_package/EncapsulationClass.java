package java_package;

public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProfile obj= new StudentProfile();
		obj.setName("Sonika");
		obj.setId("101");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}


class StudentProfile
{

	private String id;
	private String name;
	
	public void setId(String i)
	{
		id=i;
	}
	public void setName(String na)
	{
		name =na;
	}
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
}