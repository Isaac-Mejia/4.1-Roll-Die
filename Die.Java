package Dice;

public class Die 
{
		public int sides;

		public Die ()
		{	
			sides = 6;
		}
		
		public Die (int faces)
		{
			sides = faces;
		}
		
		public int roll()
		{
			int num = (int) (Math.random() * sides);
			return num;
		}
}
