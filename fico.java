import java.util.*;


class Solution
{
	public int[] noOfTriangles(int arr[])
	{
		int out[] = new int[5];
		Arrays.fill(out,-1);
		for(int i =0; i<arr.length-2; i++)
		{
			int a = arr[i];
			int b = arr[i+1];
			int c = arr[i+2];
			if(a+b>c && b+c >a && c+a > b)
				out[i] = 1;
			else
					out[i] = 0;
		}
		return out;
	}
}


class fico
{
	public static void main(String[] args) {
		Solution obj = new Solution();
		int arr[] = {1000000000,1000000000,1000000000,1000000000};

		int out[] = obj.noOfTriangles(arr);
		System.out.println("OUTPUT::");

		for(int i = 0; i<out.length; i++)
			if(out[i] == -1)
					continue;
				else
					System.out.print(out[i]+" ");
	}
}