import java.util.Scanner;

public class Main 
{
	public Main() 
	{
		// make a stack
		Stack stack = new Stack();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an expression:  ");
		String expr = input.nextLine();

		// processing the expression String
		String[] tokens = expr.split("   ");
		for (String s : tokens)// for-each loop - process all of an array/list
		{
			if (s.equals("+"))// addition
			{
				int term2 = stack.pop();
				int term1 = stack.pop();
				stack.push(term1 + term2);
			}
			else if (s.equals("-")) // subtraction
			{
				int term2 = stack.pop();
				int term1 = stack.pop();
				stack.push(term1 - term2);
			} 
			else // it must be a number
			{
				int x = Integer.parseInt(s);
			}

		}
		
		System.out.println(stack.pop());
	}

	public static void main(String[] args) 
	{
		new Main();
	}

}
