import java.util.ArrayList;

public class Stack 
{
	ArrayList<Integer> list = new ArrayList<>();
	
	public String toString()
	{
		return list.toString(); 
		
	}
	
	public void push (Integer x)
	{
		list.add(x) ;//put x at the end of the list
		
	}
	
	public int pop() 
	{
		//remove and return the last element in the list
		return list.remove(list.size() - 1) ; 
	}
}
