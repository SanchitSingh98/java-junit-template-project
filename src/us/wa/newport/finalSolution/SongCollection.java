package us.wa.newport.finalSolution;

import java.io.PrintStream;
import java.util.ArrayList;

public class SongCollection 
{
	private ArrayList<Song> songs;
	
	public SongCollection()
	{
		songs = new ArrayList<Song>();
	}
	
	public void addSong(String line)
	{
		String[] words = line.split("\t");
		songs.add(new Song(Integer.parseInt(words[0]), Integer.parseInt(words[1]), 
					words[2], words[3]));
	}
	
	public boolean filter(String field, String data)
	{
		if(!verifyField(field, data))
			return false;
		
		for(int i = 0; i < songs.size(); i++)
		{
			if(!songs.get(i).isMatch(field, data))
			{
				songs.remove(i);
				i--;
			}
		}
		
		return true;
	}
	
	public boolean insertionSort(String field)
	{
		if(!verifyField(field))
			return false;
		
		for(int i = 1; i < songs.size(); i++)
		{
			Song song = songs.get(i);
			int possibleIndex = i;
			while(possibleIndex > 0 && song.compareTo(songs.get(possibleIndex - 1), field) < 0)
			{
				songs.set(possibleIndex, songs.get(possibleIndex - 1));
				possibleIndex--;
			}
			songs.set(possibleIndex, song);
		}
		
		return true;
	}
	
	public boolean selectionSort(String field)
	{
		if(!verifyField(field))
			return false;
		
		for(int i = 0; i < songs.size() - 1; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < songs.size(); j++)
			{
				if(songs.get(j).compareTo(songs.get(minIndex), field) < 0)
					minIndex = j;
			}
			Song temp = songs.get(i);
			songs.set(i, songs.get(minIndex));
			songs.set(minIndex, temp);
		}
		
		return true;
	}
	
	public boolean mergeSort(String field)
	{
		if(!verifyField(field))
			return false;
		
		divide(0, songs.size() - 1, field);
		
		return true;
	}
	
	public void printSongs(PrintStream output)
	{
		for(int i = 0; i < songs.size(); i++)
		{
			output.println(songs.get(i));
		}
	}
	
	private boolean verifyField(String field)
	{
		return field.equals("year") || field.equals("rank") || field.equals("artist") || field.equals("title");
	}
	
	private boolean verifyField(String field, String data)
	{
		if(field.equals("year") || field.equals("rank"))
		{
			Range range = new Range(data);
			return range.formattedProperly();
		}
		
		return field.equals("artist") || field.equals("title");
	}
	
	private void divide(int startIndex, int endIndex, String field)
	{
		if(startIndex < endIndex)
		{
			int midIndex = (startIndex + endIndex) / 2;
			divide(startIndex, midIndex, field);
			divide(midIndex + 1, endIndex, field);
			
			merge(startIndex, midIndex, endIndex, field);
		}
	}
	
	private void merge(int startIndex, int midIndex, int endIndex, String field)
	{
		ArrayList<Song> sorted = new ArrayList<Song>();
		int leftIndex = startIndex;
		int rightIndex = midIndex + 1;
		
		while(leftIndex <= midIndex && rightIndex <= endIndex)
		{
			if(songs.get(leftIndex).compareTo(songs.get(rightIndex), field) < 0)
			{
				sorted.add(songs.get(leftIndex));
				leftIndex++;
			}
			else
			{
				sorted.add(songs.get(rightIndex));
				rightIndex++;
			}
		}
		
		while(leftIndex <= midIndex)
		{
			sorted.add(songs.get(leftIndex));
			leftIndex++;
		}
		
		while(rightIndex <= endIndex)
		{
			sorted.add(songs.get(rightIndex));
			rightIndex++;
		}
		
		int j = startIndex;
		for(int i = 0; i < sorted.size(); i++)
		{
			songs.set(j++, sorted.get(i));
		}
	}
}
