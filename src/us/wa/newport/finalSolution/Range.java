package us.wa.newport.finalSolution;

public class Range 
{
	private int min;
	private int max;
	private boolean formattedProperly;
	
	public Range(String range)
	{
		String[] words = range.split("-");
		
		try
		{
			if(words.length == 1)
			{
				this.min = Integer.parseInt(words[0]);
				this.max = Integer.parseInt(words[0]);
			}
			else if(words.length == 2)
			{
				this.min = Integer.parseInt(words[0]);
				this.max = Integer.parseInt(words[1]);
			}
			
			formattedProperly = true;
		}
		catch(NumberFormatException e)
		{
			formattedProperly = false;
		}
	}
	
	public boolean formattedProperly()
	{
		return formattedProperly && min <= max;
	}
	
	public boolean contains(int value)
	{
		return this.min <= value && this.max >= value;
	}
	
	public int getMin()
	{
		return this.min;
	}
	
	public int getMax()
	{
		return this.max;
	}
}
