/* 

Thread Synchronization: Synchronization is a process of handling resource accessibility by multiple thread requests. 
The main purpose of synchronization is to avoid thread interference. At times when more than one thread try to access a shared resource, 
we need to ensure that resource will be used by only one thread at a time. The process by which this is achieved is called synchronization.  
*/


import java.util.*;
class A extends Thread
{
	
	public void run()
	{
		for(int i = 0; i<10; i++)
		{
		  System.out.println("THREAD 1 RUNNING...");
		  try
		 	{
                Thread.sleep(2000);	
            }
            catch(InterruptedException e)
            {

            }
		}
		System.out.println("THREAD 1 finished its execution");	
	}
}

class B extends Thread
{
	public void run()
	{
		 
		 System.out.println("THREAD 2 started its execution");
		 for(int i = 0; i<10; i++)
		 {
		 	System.out.println("THREAD 2 RUNNING...");
		 	try
		 	{
                Thread.sleep(2000);	
            }
            catch(InterruptedException e)
            {

            }
		 	
		 }
		 System.out.println("THREAD 2 finished its execution");	
	}
}


class p3
{
	public static void main(String[] args) 
	{
			
		A t1 = new A();
		B t2 = new B();

		t1.start();
		try
		{
			t1.join();     // waits for  thread 1 to complete
		}
		catch(InterruptedException e){}
		t2.start();  		// thread 2 will start.

	}
}