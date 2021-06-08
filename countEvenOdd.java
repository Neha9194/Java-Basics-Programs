import java.util.*;
class countEvenOdd
{
	
	public static void main(String[] args) 
	{
		int n,even = 0, odd = 0;
		int arr[]=new int[50];
		Scanner obj=new Scanner(System.in);
		System.out.print("enter number of  element::");
		n=obj.nextInt();
		System.out.print("enter element ::");
		for(int i=0; i<n; i++)
			arr[i]=obj.nextInt();
		
		for(int i=0; i<n; i++)
		{
		 	if(arr[i] % 2 == 0)
		 		even++
		 	else
		 		odd++;
		}
       	System.out.println("ODD::"+odd+" EVEN::"+even);
	}
}


