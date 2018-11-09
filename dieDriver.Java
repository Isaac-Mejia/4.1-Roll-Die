package Dice;

import java.util.Scanner;

public class dieDriver 
{
	public static void main (String[] args)
	{
		final int FIVE = 5;
		Scanner type = new Scanner(System.in);
		int computer;
		
		System.out.print("Enter a number: ");
		computer = type.nextInt();
		type.close();
		
		Die dnd = new Die(computer);
		for (int i = 0; i < FIVE; i++)
		{
			System.out.println(dnd.roll());
		}
	}
}
