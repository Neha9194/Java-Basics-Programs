

import java.util.*;
class A extends Thread
{
	
	public void run()
	{
		for(int i = 0; i<50; i++)
		{
		 	System.out.println("THREAD 1");
		 	try
		 	{
                    Thread.sleep(2000);	
            }
            catch(InterruptedException e)
            {

            }
		}	
	}
}

class B extends Thread
{
	public void run()
	{
		 for(int i = 0; i<50; i++)
		 {
		 	System.out.println("THREAD 2");
		 	try
		 	{
                   Thread.sleep(4000);	
            }
            catch(InterruptedException e)
            {

            }
		 }
		 	
	}
}


class p2
{
	public static void main(String[] args) 
	{
			
		A t1 = new A();
		B t2 = new B();
		t1.start();
		t2.start();

	}
}