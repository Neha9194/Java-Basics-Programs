/*Question 1: Given an integer number n, return the difference between the product of its digits and sum of its digits
Input = 234
OUTPUT = 15

ExPLANATION  
n = 234
Sum of digits =  2 + 3 + 4 = 9
Product of digits =   2 * 3 * 4 = 24
Result = 24-9 = 15
*/
import java.util.*;
class digitSum2
{
	public static void main(String[] args) 
	{
		int n=234;
		int sum=0,num=0,multi=1;
		while(n != 0)
		{
			num=n%10;
			sum=sum+num;
			multi=multi*num;
			n=n/10;

		}

		System.out.println("Result::"+(multi-sum));


	}
}