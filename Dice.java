import java.util.Random;
public class Dice 
{
	int sides;
	Dice(int sides)
	{
		this.sides = sides;
	}
	
	public static void main(String args[])
	{
		Random rt = new Random();
	
		Dice ob = new Dice(6);
		if(ob.sides==2)
		{
			System.out.println(ob.twoSided());
			
		}
		else if(ob.sides==4)
		{
			System.out.println(ob.fourSided());
		}
		else if(ob.sides==6)
		{
			System.out.println(ob.sixSided());
			//ob.sixSided();
		}
			
	}
	
	public String twoSided()
	{
		String st;
		Random rt = new Random();
		int n = rt.nextInt(2)+1;
		if(n==1)
			st = "Head";
		else
			st = "Tail";
		return st;
		//System.out.println(n);
	}
	public String fourSided()
	{
		String st;
		Random rt = new Random();
		
		st = getValue(rt.nextInt(4)+1);
		return st;
		
	}
	public String sixSided()
	{
		String st;
		Random rt = new Random();
		st = getValue(rt.nextInt(6)+1);
		return st;

	}
	public String getValue(int n)
	{
		String st;
		if(n==1)
			st = "one";
		else if(n==2)
			st = "two";
		else if(n==3)
			st = " three";
		else if(n==4)
			st = "four";
		else if(n==5)
			st = "five";
		else
			st = "six";
		
		return st;
	}

}
