import java.util.*;


class A extends  Thread
{
	public void run()
	{
		for(int i =0; i<10; i++)
		{
			System.out.println("Hello Neha ji");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){

			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i =0; i<10; i++)
		{
			System.out.println("Good Night");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){

			}
		}

	}
}


class multithreading
{
	public static void main(String[] args) {
		A t1 = new A();
		B t2 = new B();
		t1.start();
		try{
			
			t1.join();
		}catch(InterruptedException e){

		}
		t2.start();	
	}
	
}