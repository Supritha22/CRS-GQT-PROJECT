
package oops;
 class Student
{
	int id;
	String name;
	Student()
	{
		id=1234;
		name="Raju";
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	class Main
	{
		public  void main(String args[])
		{
			Student s1=new Student();
			s1.display();
		}
	}
}
		

	


