package us.wa.newport.finalSolution;

public class Song 
{
	private int year;
	private int rank;
	private String artist;
	private String title;
	
	public Song(int year, int rank, String artist, String title)
	{
		this.year = year;
		this.rank = rank;
		this.artist = artist;
		this.title = title;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public int getRank()
	{
		return this.rank;
	}
	
	public String getArtist()
	{
		return this.artist;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String toString()
	{
		return this.year + "\t" + this.rank + "\t" + this.artist + "\t" + this.title;
	}
	
	public int compareTo(Song otherSong, String field)
	{
		if(field.equals("year"))
		{
			return Integer.compare(this.year, otherSong.getYear());
		}
		else if(field.equals("rank"))
		{
			return Integer.compare(this.rank, otherSong.getRank());
		}
		else if(field.equals("artist"))
		{
			return this.artist.toLowerCase().compareTo(otherSong.getArtist().toLowerCase());
		}
		else if(field.equals("title"))
		{
			return this.title.toLowerCase().compareTo(otherSong.getTitle().toLowerCase());
		}
		
		return 0;
	}
	
	public boolean isMatch(String field, String value)
	{
		if(field.equals("year"))
		{
			Range range = new Range(value);
			return range.contains(this.year);
		}
		else if(field.equals("rank"))
		{
			Range range = new Range(value);
			return range.contains(this.rank);
		}
		else if(field.equals("artist"))
		{
			return this.artist.toLowerCase().contains(value.toLowerCase());
		}
		else if(field.equals("title"))
		{
			return this.title.toLowerCase().contains(value.toLowerCase());
		}
		
		return false;
	}
}
