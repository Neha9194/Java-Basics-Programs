import java.util.*;

class fxn
{
	
	public static int addTwoDigits(int n) 
	{
   		int sum = 0; 
    	while(n != 0)
    	{
        	int rem = n % 10;
        	sum = sum + rem;
        	n = n/10;
    	}
		return sum;
	}


	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int t = 3;
		while(t >= 0)
		{
			int n;
			n = obj.nextInt();
			System.out.println(addTwoDigits(n));
		}
	}
} 
