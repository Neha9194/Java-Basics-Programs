import java.util.*;
class digitCount
{
	public static void main(String[] args) {
		int n;
		Scanner obj = new Scanner(System.in);
		n  = obj.nextInt();
		//int count=0;

		/*while(n !=0)
		{
			count++;
			n=n/10;
		}*/
		System.out.println("No of digits ::"+Math.floor(Math.log10(n)+1));
	}
}