import java.util.*;
class Actor
{
	public void display()	
	{
		String s1="Story";
		System.out.println("name of movie is =::" +s1);
		String s2="Hero";
		System.out.println("role of actor is=::" +s2);
	}
}
class rajshree extends Actor
{
	public void display()
	{
		super.display();
		String s1="hum";
		System.out.println("movie name is =::" +s1);
		String s2="police";
		System.out.println("actor role is=::" +s2);
	}
}

class cinema
{
	public static void main(String args[])
	{
		rajshree r=new rajshree();
		r.display();
	}
}