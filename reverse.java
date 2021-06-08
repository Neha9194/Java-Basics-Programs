import java.util.*;
class reverse
{
      public static void main(String[] args) 
      {
      	/*int n,rev=0,temp;
      	n = 12121;
      	temp =n;
        while(n!=0)
        {
        	int rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;

        }

        System.out.println("Value of N after iterations::"+n);

        
        for(; n!=0 ;)
        {
			int rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        }

       	System.out.println("reverse  "+ rev);*/


       	String str1 = "aabba";
       	String str2 = "";
       	for(int i = str1.length()-1; i>=0; i--)
       	{
       		str2 += str2.valueOf(str1.charAt(i));
       	}
       	System.out.println(str2);
       	if(str1.equals(str2))
       	{
       		System.out.println("PALINDROME");
       	}
       	else
       	{
       		System.out.println("NOT PALINDROME");
       	}

      }

}