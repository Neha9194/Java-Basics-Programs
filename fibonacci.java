class fibonacci
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 1;
		System.out.print(i+" ");
		System.out.print(j+" ");
		int k = i+j;
		while(k<10)
		{
			System.out.print(k+" ");
			i = j;
			j = k;
			k = i +j;
		}


	}
}



