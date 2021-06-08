import java.util.*;
class prime
{ 
	   public static void main(String[] args) 
	   {
	   		int n;
	   		Scanner s=new Scanner(System.in);
	   		System.out.println("enter a number");
	   		n=s.nextInt();
	   		int flag = 0;
	   		if(n==2)
	   			System.out.println("ITS A PRIME");
	   		else
	   		{
	   			for(int i=2; i<n ;i++)
	   			{
	   				if(n%i==0)
	   				{
		   				flag = 0;
		   				break;
	   				}
	   				else
	   					flag = 1;
	   			}

	   			if(flag==1)
	   				System.out.println("ITS A  PRIME");
	   			else
	   				System.out.println(" NOT PRIME");

	   		}
	   		
	   }
}