import java.util.*;
class sortInDesc
{
	public static void main(String[] args) {
		int n,temp;
		int arr[]=new int[50];
		Scanner obj=new Scanner(System.in);
		System.out.print("enter number of  element::");
		n=obj.nextInt();
		System.out.print("enter element ::");
		for(int i=0; i<n; i++)
			arr[i]=obj.nextInt();
		
        System.out.print("before sorting ::");

		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nafter sorting ::");

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] <	arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
		}
 
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

