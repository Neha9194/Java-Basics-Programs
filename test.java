
/* LAMBDA EXPRESSION -> Lambda expression is, essentially, an anonymous or unnamed method. The lambda expression does not 
   execute on its own. Instead, it is used to implement a method defined by a functional interface.
   
   Declaration :  (parameter list) -> lambda body
   The new operator (->) used is known as an arrow operator or a lambda operator.

   Suppose, we have a method like this:
   int add(int a, int b) 
   	{
    	return a+b;
	}
	We can write this method using lambda expression as:
	(a,b) -> (a+b) 
*/
 
// CODE::
import java.util.*;

interface LambdaExpression      //functional interface
{
	int operations(int a, int b);
} 

class test
{
	public static void main(String[] args) 
	{
		LambdaExpression ob1 = (a,b)->(a+b);    
		System.out.println("Addition = "+ob1.operations(20,30));     //calling for ADDITION

		LambdaExpression ob2 = (a,b)->(a-b);
		System.out.println("subtraction = "+ob2.operations(20,30));  //calling for SUBTRACTION

		LambdaExpression ob3 = (a,b)->(a * b);
		System.out.println("Multiplly = "+ob3.operations(20,30));    // calling for MULTIPLICATION

		LambdaExpression ob4 = (a,b)->(a/b);
		System.out.println("Division = "+ob4.operations(100,50));    // calling for DIVISION

		LambdaExpression ob5 = (a,b)->(a % b);
		System.out.println("Modulous = "+ob5.operations(30,25));	 // calling for MODULOUS

	}
}