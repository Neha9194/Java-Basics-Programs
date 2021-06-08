	import java.util.*;
	class reverseString
	{
		public static void main(String[] args) {
			
		StringBuilder str1 = new StringBuilder("GeeksforGeeks");
     
     	int i =0;
     	int j = str1.length()-1; 
       
       	while(i<j)
       	{
       		char temp = str1.charAt(i);
       		str1.charAt(i) = str1.charAt(j);
       		str1.charAt(j) = temp;
       		i++;
       		j--;
       	}
       	System.out.println(str1);
		
	}
}

