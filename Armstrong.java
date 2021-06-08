import java.util.*;
class Armstrong
{
	public static void main(String[] args) 
	{
		int num ,result=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number::");
		num = obj.nextInt();
		int original = num;
		//System.out.println("Power is "+Math.pow(num,3));

		int digit=0;
		while(num!=0)
		{
			digit++;
			num = num/10;
		}
		System.out.println("DIGITS::"+digit);	
		num = original;
		while(num!=0)
		{
			int rem=num%10;
			result =  (int)(result + Math.pow(rem,digit));
			num = num/10;
		}
		if(original == result)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NOT ARMSTRONG");
	}
}