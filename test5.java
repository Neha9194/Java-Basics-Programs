/*
Question 3: Check whether the number is Armstrong or not 

*/
import java.util.*;
class test5
{
	public static void main(String[] args) {
		int num=1634;
		int original=num;
		int result=0;

		while(num!=0)
		{
			int rem=num%10;
			result= (int) (result + Math.pow(rem,(int)(1+Math.log(num))));
			num=num/10;
		}
		if(original==result)

			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}
}