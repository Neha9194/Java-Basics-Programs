class branch1
{
	static int account1 = 123;
	String name = "Akshay";

}

class statDemo
{
	public static void main(String[] args)
	{
		branch1 obj1 = new branch1();
		branch1 obj2 = new branch1();
		obj1.account1 = 345;

		System.out.println(obj1.account1);
		System.out.println(obj2.account1);
	}
}


