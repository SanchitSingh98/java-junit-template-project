package us.wa.newport.finalSolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class GazillionSongs 
{
			 public static void main(String[] args) throws FileNotFoundException{
	            System.out.println("Welcome. This program will sort/filter popular songs.");
	            Scanner console = new Scanner(System.in);
	            System.out.print("Enter input file: ");
	            String fileName = console.nextLine();
	            File file = new File(fileName);
	            if(!file.exists()){
	                System.out.println(fileName+" not found");
	            	}
	            Scanner input = new Scanner(file);
	            String[] words;
	            SongCollection songs = new SongCollection();
	            while(input.hasNext()){
	                words = input.nextLine().split("\t");
	                Song song = new Song(words);
	                songs.addSongs(song);
	            }
	            
	            System.out.print("Enter sort/search command: ");
	            String command = console.nextLine();
	            String[] commandParts = command.split(":");
	            if(commandParts[0].equals("filter")){
	            	try{
	            		songs.filter(commandParts[1],commandParts[2]);
	            	}catch(Exception error){
	            		System.out.println("Incorrect format.");
	            	}
	            }else if(commandParts[0].equals("insertionSort")){
	            	try{
	            		songs.insertionSort(commandParts[1]);
	            	}catch(Exception error){
	            		System.out.println("Incorrect format.");
	            	}
	            }else if(commandParts[0].equals("selectionSort")){
	            	try{
	            		songs.selectionSort(commandParts[1]);
	            	}catch(Exception error){
	            		System.out.println("Incorrect format.");
	            	}
	            }else if(commandParts[0].equals("mergeSort")){
	            	try{
	            		songs.mergeSort(commandParts[1]);
	            	}catch(Exception error){
	            		System.out.println("Incorrect format.");
	            	}
	            }else{
	                System.out.println("Unrecognized command. Exiting...");
	                return;
	            }
	            
	            System.out.print("Enter output file: ");
	            String outputName = console.nextLine();
	            try{
	            File out = new File(outputName);
	            if(out.exists()){
	                System.out.println(out +" already exists. Overwriting "+out);
	            }
	            PrintStream output = new PrintStream(out);
	            songs.printSongs(output);
	            }catch(FileNotFoundException e){
	            	System.out.println(outputName + "not found. Exiting...");
	            }
	}
	
}
