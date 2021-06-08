import java.util.*;
class factorial
{
	 public static void main(String[] args) 
	 {
	 	int num,fact=1;
	 	Scanner obj= new Scanner(System.in);
	 	num= obj.nextInt();

	 	 for(int i = num;  i >=1; i--)
	 	 	fact=i*fact;
	 	 
	 	 System.out.println("FACTORIAL OF "+num+" IS::"+fact);
	 }
	 
}



