/*class infytq
{
	 //class variable or instance variable


	public static void main(String[] args) 
	{
		//int x = 0;  //local variable
		//
		//int a =10;
		/*  if(a > 5)
				System.out.println("BINGO");
			else
				System.out.println("FUZZY"); */

		//Ternary Operator:
		//Syntax - condition ? stmt 1 : stmt 2;
		/* String str="";
		 str=  (a < 5) ? "Akshay" : "NeHA";

		 System.out.println(str); */

		 /* x = x + 10;   
		  x += 10;
		  System.out.println(x);*/

	
		 

		 /*float a = 10.123f;
		 int b;
		 b = (int) a;*/

		//Write the code for printing A and B;

        //System.out.print("Hello BYE "+a+" "+b);
		
		//if(++a > 2 && ++b < 6 )
		 		
		//else
				//System.out.println("SOCHIYE KYU??");

//		} 


//}



/*{
	public static void main(String[] args) 
	{
		// LOOPS
		//1) FOR , WHILE - ENTRY CONTROLLED LOOP
		//2) DO WHILE - EXIT CNTROLLED LOOP

	 
	    //for (int a = 0;a <10 ;a++)
	   // {
	    //	System.out.println(a);
	    //	a++;
	    //} 
	   
         int a =1;
	    do
	    {

	    	System.out.println(a);
	    }while(a>10);


	}
}  */
/*
class infytq
{
	public static void main(String[] args) 
	{
		int k = 1;
		
		for(int i = 1 ;i<= 10 ;i++)
		{
			if(i<5)
			{
				System.out.println(i);
			}
			else
			{
				break;
			}
			System.out.println("BYE");
		}
		
	}
}
*/


// CLASSES AND OBJECTS

//FUNCTIONS/////
/*
class test
{
	int a,b; //instance variable
	public void add()   //No return type No argument
	{
		System.out.println("ADD = "+(a+b));
	}

	public int multiply()   // Return with No arguments
	{
			return a*b;	
	}   

	public void divide(int x, int y)    // No return Type but Argument
	{
		System.out.println("Division = "+(x/y));
	}
	public int subtract(int p , int q)
	{
		return p-q;
	}
	public char Last_letterOfString(String str)
	{
		int l = str.length();
		return (str.charAt(l-1));

	}

}

class infytq
{
	public static void main(String[] args) 
	{
		test obj = new test();
		obj.a = 10;
		obj.b = 20;
		//obj.add();
		//int k = obj.multiply();
		//System.out.println(k);
		//obj.divide(20,10);
		//int k = obj.subtract(20,10);
		//System.out.println(k);

		char ch = obj.FirstLetterOfMyName("jkh iufhkhfjsdklfsdakfjsdilfjsdafjlds");
		System.out.println(ch);
	}
}*/


// CALL BY VALUE 
/*
class swap
{
	public void swappingFunction(int x , int y)  //Calling by value 
	{
		int temp  = x;							// copies the actual arguments int different memory locations
		x = y;
		y = temp;
		System.out.println("INSIDE SWAAPING FXN");
		System.out.println("X = "+x+" Y = "+y);
	}
}
class infytq
{
	public static void main(String[] args) 
	{
		
		int x  = 10;
		int y  = 20;
		swap obj = new swap();
		System.out.println("BEFORE SWAPPING");
		System.out.println("X = "+x+" Y = "+y);
		

		System.out.print("After Swapping");
		obj.swappingFunction(x , y);
		
		System.out.println("AFTER EXECUTING SWAPPING FXN!!");
		System.out.println("X = "+x+" Y = "+y);

	}
}
*/

//PASSING BY REFERENCE//
/*
class staticDemo
{
	int a,b;
	staticDemo(int x , int y)
	{
		a = x;
		b = y;
	}
	void swap(staticDemo T)
	{
		int temp = T.a;
		T.a = T.b;
		T.b = temp;

		System.out.println("INSIDE SWAAPING FXN");
		System.out.println("A = "+T.a+" B = "+T.b);
	}
}
class infytq
{
	public static void main(String[] args) 
	{
		staticDemo obj = new staticDemo(10,20);


		System.out.println("Before Call:: A = "+obj.a+" "+"B= "+obj.b);
		obj.swap(obj);
		System.out.println("After Call:: A = "+obj.a+" "+obj.b);
		
	}
}
*/
/*
import java.util.*;

class infytq
{
	public static void main(String[] args) 
	{
		
		//int[] arr1 = {1,2,3,4,5};  //declaration
		//System.out.println(arr1[2])
		Scanner obj = new Scanner(System.in);

		//int [][] arr = {{1,2},{3,4},{5,6}};   //array defined and element inserted 
		//System.out.println(arr[2][0]);

		int [][] arr2 = new int[3][2];

		for(int i=0 ;i<3 ;i++)
		{
			for(int  j=0 ;j<2;j++)
			{
				arr2[i][j] = obj.nextInt();
			
			}

		}


		for(int i=0 ;i<3 ;i++)
		{
			for(int  j=0 ;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			
			}
			System.out.println();
		}

	}
}

// int ar[][] = {{1,2,3,4},,{5,6,7,8},{9,10,11,12} }


ar[0] = {1,2,3,4}  -> ar[0].length
ar[0][0] = 1
ar[0][1] =2
ar[0][3] =4


ar[1] ={5,6,7,8}  ->  ar[1].length

ar1[1][0]

*/
/*
class A
{
	A(int a)
	{
		System.out.println("I AM A's Constructor");
	}
	
}

class B extends A
{
	B()
	{
		super(10);	
		System.out.println("I AM B's Constructor");

	}
}

class infytq
{
	public static void main(String[] args) 
	{
		B obj = new B();
		
	

	}
}*/

/*
class A
{
	
	A()
	{
		System.out.println("ABOUT NEHA MADAM");
	}
	A(int a)
	{
		System.out.println("I DONT KNOW THE MEANING OF MY NAME");
	}


	void NehaMam(int a)    // Overloading NehaMam fxn  Static polymorphism
	{
		System.out.print(a+" ");
		System.out.println("Sometimes Confused.");
	}

	void NehaMam(float b)
	{
		System.out.print(b+" ");
		System.out.println("Sometimes Happy");
	}
	void NehaMam(int a, int b)
	{
		System.out.println(a+" But Mam wants to be self dependent in her life");
		System.out.println(b+" And mam will become independent in one day");
	}
	int NehaMam(char c)
	{
		System.out.println("Always desperate to get 30/30 in CA");
		return 0;
	}
}

class infytq
{
	public static void main(String[] args) 
	{
		
		A obj = new A();
		A ob = new A(2);
		obj.NehaMam(1);
		obj.NehaMam(2.0f);
		obj.NehaMam(3,4);
		obj.NehaMam('a');

	}
}*/


class A
{
	void display()
	{
		System.out.println("A class ka display function hai");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("B class ka display fuction hai");
	}
}

class infytq
{
	public static void main(String[] args) {
		
		A obj = new B();
		obj.display();
	}
	
}