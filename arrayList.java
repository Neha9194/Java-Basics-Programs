import java.util.*;
class arrayList
{
	public static void main(String[] args) {
		
		ArrayList obj  = new ArrayList();
		
		for(int i = 1; i<=5; i++)
			obj.add(i);

		obj.add("RED");
		
		obj.add(2,"X");
		System.out.println(obj);

	}
}