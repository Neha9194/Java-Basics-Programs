import java.util.*;
class check
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		char ch,count=0;
		System.out.println("Enter the character::");
		ch = obj.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
			ch == 'A'|| ch == 'E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("vowel");

		else

			System.out.println("Consonant");  
			 count=count++;  
	}
	    
}