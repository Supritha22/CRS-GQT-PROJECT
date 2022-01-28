package oops;
class Main
{
	float length;
	float breadth;
	void insert(float L,float b)
	{
		length=L;
		breadth=b;
	}
	void area()
	{
		System.out.println(length*breadth);
	}
}
class Rect
{
	public static void main(String args[])
	{
		
		Main r1=new Main();
		Main r2=new Main();
		r1.insert(5,4);
		r2.insert(3,6);
		r1.area();
		r2.area();
	}
}

		
	
	
	



