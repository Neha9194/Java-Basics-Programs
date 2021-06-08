import java.util.*;

class arrayListOperations
{
	ArrayList arr;
	arrayListOperations()
	{
		arr = new ArrayList();
	}
	
	void addElement(String str)
	{
		arr.add(str);
	}
	void iterateArrayList()
	{
		for(int i =0; i< arr.size(); i++)  
 			System.out.print(arr.get(i)+" ");
 		System.out.println();
	}
	void insertAtFirst(String str)
	{
		arr.add(0,str);
	}
	void retrieve(int index)
	{
		System.out.println(arr.get(index));

	}
	void updateList(int index, String updatedValue)
	{
		arr.set(index, updatedValue);
	}
	void search(String str)
	{
		int i;
		for(i = 0; i< arr.size(); i++)
		{
			if(arr.get(i) == str)
			{
				System.out.println(str+" ELEMENT FOUND AT INDEX "+i);
				break;
			}
		}
		if(i == arr.size())
			System.out.println(str+"  NOT PRESENT !!!! ");
	}
}
class p1
{
	public static void main(String[] args) 
	{
		
		arrayListOperations list = new arrayListOperations();

		list.addElement("RED");      //adding elements to list
		list.addElement("YELLOW");
		list.addElement("GREEN");
		list.iterateArrayList();     // iterating the list

		list.insertAtFirst("PINK");  // inserting PINK at first position
		System.out.println("\nAfter inerting PINK at first position");
		list.iterateArrayList();
		System.out.println("Retreving index 2");
		list.retrieve(2);			// retriving second index
		list.updateList(3,"BLACK"); // updating GREEN to BLACK
		System.out.println("\nAfter updating GREEN to BLACK");  
		list.iterateArrayList();  
		list.search("BLACK");  //present in list
		list.search("BROWN"); //not present in list
	}
}