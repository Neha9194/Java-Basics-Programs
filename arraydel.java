import java.util.*;
class arraydel
{
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		int n,value,index;
		Scanner obj = new Scanner(System.in);
		System.out.print("How many element you want to enter::");
		n = obj.nextInt();

		for(int i = 0;i <n; i++)
			arr[i] = obj.nextInt();

		System.out.println("Enter the index where you want to delete array");
		index = obj.nextInt();
		
		System.out.println("\nBefore deleting the array::");
		for(int i= 0; i<n ;i++)
			System.out.print(arr[i]+" ");
		

		for(int i = index; i< n-1; i++)
			arr[i]  = arr[i+1];
		
		n--;
		System.out.println();
		for(int i= 0; i<n ; i++)
			System.out.print(arr[i]+" ");
	}
}      	