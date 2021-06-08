import java.util.*;
class arraySum
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[100];
		Scanner obj = new Scanner(System.in);
		System.out.print("How many elements you want to enter::");
		int n = obj.nextInt();

		System.out.println("Enter elements");
		for(int i =0; i<n ;i++)
		{
			arr1[i] = obj.nextInt();
		}
		System.out.print("ELEMENTS OF ARRAY::");
		
		int sum = 0;
		for(int i =0; i<n; i++)
		{
			sum = sum * arr1[i];
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nSUM OF ARRAY::"+sum);
	}
}