import java.util.*;
class arraymax
{
	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		
		Scanner obj = new Scanner(System.in);
		System.out.print("How many element you want to enter::");
		int n = obj.nextInt();
		System.out.print("Enter elements::");
		
		for(int i = 0;i <n; i++)
			arr[i] = obj.nextInt();
		
		int max=arr[0];
		for(int i=0; i<n; i++)
			if(arr[i] >= max)
				max=arr[i];
		
		System.out.print("Maximum::"+max);
	}
}

//its a silly mistake ye aapko padhane ka nateeza hai  :)
mistake itni thi ki array read krne se pehle hi max[0] = arr[i] likha tha...so default 0 chala jaa rha tha 
joki -1 se bada hai 0 > -1

