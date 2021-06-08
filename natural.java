import java.util.*;
class natural
{ 
	   public static void main(String[] args) 
	   {
	   		int num,sum=0;
	   		Scanner s=new Scanner(System.in);
	   		System.out.println("enter a number");
	   		num=s.nextInt();
	   		int i=1;
	   	 	   while(i<=num)
	   	 	    {//for(int i=1; i<=num; i++)
	   	 		  sum=sum+i;
	   	 		  i++;
	   	 	    }
	   	 	
	   	 	System.out.println("sum of natural number "+ sum);
	   }
}