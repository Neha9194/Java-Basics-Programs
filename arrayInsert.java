import java.util.*;
class arrayInsert
{
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		int n,value,index;
		Scanner obj = new Scanner(System.in);
		System.out.print("How many element you want to enter::");
		n = obj.nextInt();

		for(int i = 0;i <n; i++)
		{
			arr[i] = obj.nextInt();
		}
		
		System.out.println("Enter value and index where you want to insert");
		value = obj.nextInt();
		index = obj.nextInt();

		if(n == 10)
			System.out.println("ARRAY IS FULL !!!");
		else
		{
			for(int i = n-1; i>=index ; i--)
				arr[i+1] = arr[i];
		
			arr[index] = value;
			n++;
		}
		for(int i =0; i < n; i++)  //0 to 9       
			System.out.print(arr[i]+" ");

			
		
	}
}

//what?voice nhi aa rhi teamviwerpe
