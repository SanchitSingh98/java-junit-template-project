package us.wa.newport.finalSolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class GazillionSongs 
{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter input file: ");
		String filename =  console.nextLine();
		SongCollection songs = new SongCollection();
		processInput(filename, songs, console);
				
		System.out.print("Enter a sort/search command: ");
		processCommand(console.nextLine(), songs, console);
		
		System.out.print("Enter output file: ");
		filename = console.nextLine();
		outputFile(filename, songs, console);
		
		console.close();
	}
	
	private static void processInput(String filename, SongCollection songs, Scanner console) throws FileNotFoundException
	{
		File input = new File(filename);
		
		while(!input.exists())
		{
			System.out.print("Input file " + filename + " does not exist. Please re-enter...");
			filename = console.nextLine();
			input = new File(filename);
		}
		
		Scanner inputFile = new Scanner(input);
		while(inputFile.hasNextLine())
		{
			songs.addSong(inputFile.nextLine());
		}
		
		inputFile.close();
	}
	
	private static void processCommand(String input, SongCollection songs, Scanner console)
	{		
		while(!processCommand(input, songs))
		{
			System.out.println("Command \"" + input + "\" is not formatted correctly. Please re-enter the command...");
			input = console.nextLine();
		}
	}
	
	private static boolean processCommand(String input, SongCollection songs)
	{
		String[] command = input.split(":");
		if(command.length == 3 && command[0].equals("filter"))
		{
			return songs.filter(command[1], command[2]);
		}
		else if(command.length == 2 && command[0].equals("insertionSort"))
		{
			return songs.insertionSort(command[1]);
		}
		else if(command.length == 2 && command[0].equals("selectionSort"))
		{
			return songs.selectionSort(command[1]);
		}
		else if(command.length == 2 && command[0].equals("mergeSort"))
		{
			return songs.mergeSort(command[1]);
		}
		else
		{
			return false;
		}
	}
	
	private static void outputFile(String filename, SongCollection songs, Scanner console) throws FileNotFoundException
	{
		File output = new File(filename);
		
		if(output.exists())
		{
			System.out.print("Output file " + filename + " already exists. Do you want to overwrite the file? ");
			String answer = console.nextLine();
			if(!answer.equals("Yes") && !answer.equals("yes"))
			{
				System.out.print("Ok, we won't overwrite the file. Exiting the program now.");
				return;
			}
		}
		
		PrintStream outputFile = new PrintStream(output);
		songs.printSongs(outputFile);
		outputFile.close();
	}
}
