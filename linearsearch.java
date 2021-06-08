/*Question 2: Search the element from the array and print its index if element is present else print "Element not Found"

Input : arr[] = {1,2,3,4,5}
		x = 3
Output: Element found at location 2

Input : arr[] = {5,6,7,8,9}
		x = 1
Output: Element not found
*/
import java.util.*;
class linearsearch
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int x;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter x  ::");
		x=obj.nextInt();

		int i;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Element found at index "+i);
				break;
			}
		}
		if(i == arr.length)
			System.out.println("Sorry Element not present in array");
	}
}