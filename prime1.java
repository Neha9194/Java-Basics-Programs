/*Check whether the number is prime or not:
*/
import java.util.*;
class prime1
{
	public static void main(String[] args) {
		int n,i,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		if(n ==2)
			flag =1;
		for(i=2; i<n; i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
			else
			 flag=1;	
		}
		if(flag==1)
			System.out.println("prime");
		    else
		    System.out.println("not prime");
	}
}





