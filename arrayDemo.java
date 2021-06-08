/* 

INTRODUCTION TO ARRAYS
-> It is a homogenous linear data structure consisting of single type of element
-> Contigous memory allocated.


DECLARATION :
	
	datatype array_name[] = new datatype[size]

Eg: int arr1[]   = new int[10];     // only stores int values.
Eg: char arr2[]  = new char[10];	  // only stores char values like 'a','b','c'........'z'
Eg: float arr3[] = new float[10];   // only stores float values.

*/
import java.util.*;
class arrayDemo
{
	public static void main(String[] args) 
	{
		char arr1[] = new char[100];
		Scanner obj = new Scanner(System.in);
		System.out.print("How many elements you want to enter::");
		int n = obj.nextInt();

		System.out.println("Enter elements");
		for(int i =0; i<n ;i++)
		{
			arr1[i] = obj.next().charAt(0);
		}
		System.out.print("ELEMENTS OF ARRAY::");
		for(int i =0; i<n; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
}