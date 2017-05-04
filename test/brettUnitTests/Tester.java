package brettUnitTests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import us.wa.newport.finalSolution.*;

public class Tester {
	
	@Test
	public void BasicFilterYear()
	{
		File expected = new File("BasicFilterYearExpected.txt");
		File actual = new File("BasicFilterYear.txt");
		String inputString = "aGazillionSongs.txt\nfilter:year:1990\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicFilterYearRange()
	{
		File expected = new File("BasicFilterYearRangeExpected.txt");
		File actual = new File("BasicFilterYearRange.txt");
		String inputString = "aGazillionSongs.txt\nfilter:year:1990-1999\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicFilterRank()
	{
		File expected = new File("BasicFilterRankExpected.txt");
		File actual = new File("BasicFilterRank.txt");
		String inputString = "aGazillionSongs.txt\nfilter:rank:1\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicFilterRankRange()
	{
		File expected = new File("BasicFilterRankRangeExpected.txt");
		File actual = new File("BasicFilterRankRange.txt");
		String inputString = "aGazillionSongs.txt\nfilter:rank:1-10\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicFilterArtist()
	{
		File expected = new File("BasicFilterArtistExpected.txt");
		File actual = new File("BasicFilterArtist.txt");
		String inputString = "aGazillionSongs.txt\nfilter:artist:frank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicFilterTitle()
	{
		File expected = new File("BasicFilterTitleExpected.txt");
		File actual = new File("BasicFilterTitle.txt");
		String inputString = "aGazillionSongs.txt\nfilter:title:one\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicInsertionSortYear()
	{
		File expected = new File("BasicInsertionSortYearExpected.txt");
		File actual = new File("BasicInsertionSortYear.txt");
		String inputString = "80s.txt\ninsertionSort:year\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}

	@Test
	public void BasicInsertionSortRank()
	{
		File expected = new File("BasicInsertionSortRankExpected.txt");
		File actual = new File("BasicInsertionSortRank.txt");
		String inputString = "80s.txt\ninsertionSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}

	@Test
	public void BasicInsertionSortArtist()
	{
		File expected = new File("BasicInsertionSortArtistExpected.txt");
		File actual = new File("BasicInsertionSortArtist.txt");
		String inputString = "80s.txt\ninsertionSort:artist\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}

	@Test
	public void BasicInsertionSortTitle()
	{
		File expected = new File("BasicInsertionSortTitleExpected.txt");
		File actual = new File("BasicInsertionSortTitle.txt");
		String inputString = "80s.txt\ninsertionSort:title\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicSelectionSortYear()
	{
		File expected = new File("BasicSelectionSortYearExpected.txt");
		File actual = new File("BasicSelectionSortYear.txt");
		String inputString = "80s.txt\nselectionSort:year\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicSelectionSortRank()
	{
		File expected = new File("BasicSelectionSortRankExpected.txt");
		File actual = new File("BasicSelectionSortRank.txt");
		String inputString = "80s.txt\nselectionSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicSelectionSortArtist()
	{
		File expected = new File("BasicSelectionSortArtistExpected.txt");
		File actual = new File("BasicSelectionSortArtist.txt");
		String inputString = "80s.txt\nselectionSort:artist\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicSelectionSortTitle()
	{
		File expected = new File("BasicSelectionSortTitleExpected.txt");
		File actual = new File("BasicSelectionSortTitle.txt");
		String inputString = "80s.txt\nselectionSort:title\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicMergeSortYear()
	{
		File expected = new File("BasicMergeSortYearExpected.txt");
		File actual = new File("BasicMergeSortYear.txt");
		String inputString = "80s.txt\nmergeSort:year\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicMergeSortRank()
	{
		File expected = new File("BasicMergeSortRankExpected.txt");
		File actual = new File("BasicMergeSortRank.txt");
		String inputString = "80s.txt\nmergeSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicMergeSortArtist()
	{
		File expected = new File("BasicMergeSortArtistExpected.txt");
		File actual = new File("BasicMergeSortArtist.txt");
		String inputString = "80s.txt\nmergeSort:artist\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicMergeSortTitle()
	{
		File expected = new File("BasicMergeSortTitleExpected.txt");
		File actual = new File("BasicMergeSortTitle.txt");
		String inputString = "80s.txt\nmergeSort:title\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, actual);
		assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingInputFile()
	{
		File actual = new File("Output.txt");
		String inputString = "DoesNotExist.txt\n80s.txt\nfilter:year:1980\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingOutputFile()
	{
		File expected = new File("BasicErrorCheckingOutputFileExpected.txt");
		File actual = new File("BasicErrorCheckingOutputFile.txt");
		String inputString = "80s.txt\nfilter:year:1980\n" + actual.getName() + "\nyes\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		verifyOutputFile(expected, actual);
	}
	
	@Test
	public void BasicErrorCheckingFilter()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nfilter:unknown:1985\nfilter:year:1985\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingFilterRangeYear()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nfilter:year:1985-1983\nfilter:year:1983-1985\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingFilterRangeRank()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nfilter:rank:10-1\nfilter:rank:1-10\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingInsertionSort()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\ninsertionSort:unknown\ninsertionSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingSelectionSort()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nselectionSort:unknown\nselectionSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingMergeSort()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nmergeSort:unknown\nmergeSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void BasicErrorCheckingUnknownCommand()
	{
		File actual = new File("Output.txt");
		String inputString = "80s.txt\nunknown:unknown\ninsertionSort:rank\n" + actual.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
		
		if(actual.exists())
			assertTrue(actual.delete());
	}
	
	@Test
	public void CompoundedRuns()
	{
		File expected = new File("60sExpected.txt");
		File sixties = new File("60s.txt");
		String inputString = "aGazillionSongs.txt\nfilter:year:1960-1969\n" + sixties.getName() + "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, sixties);
		
		expected = new File("60sSortedRankExpected.txt");
		File sixtiesSortedRank = new File("60sSortedRank.txt");
		inputString = sixties.getName() + "\nselectionSort:rank\n" + sixtiesSortedRank.getName() + "\n";
		input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, sixtiesSortedRank);
		
		expected = new File("60sSortedRankExpected.txt");
		File sixtiesSortedRankFilteredArtist = new File("60sSortedRankFilteredArtist.txt");
		inputString = sixtiesSortedRank.getName() + "\nfilter:artist:john\n" + sixtiesSortedRankFilteredArtist.getName() + "\n";
		input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
		try {
			GazillionSongs.main(null);
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}

		verifyOutputFile(expected, sixtiesSortedRank);
		
		assertTrue(sixties.delete());
		assertTrue(sixtiesSortedRank.delete());
		assertTrue(sixtiesSortedRankFilteredArtist.delete());
	}
	
	private void verifyOutputFile(File expectedFile, File actualFile)
	{
		Scanner expected, actual;
		try {
			expected = new Scanner(expectedFile);
			actual = new Scanner(actualFile);
			
			while(expected.hasNextLine() && actual.hasNextLine())
			{
				assertTrue(expected.nextLine().equals(actual.nextLine()));
			}
			
			if(expected.hasNextLine())
			{
				fail("Output file is missing some songs!");
			}
			else if(actual.hasNextLine())
			{
				fail("Output file has extra songs!");
			}
			
			expected.close();
			actual.close();
		}
		catch (FileNotFoundException e) {
			fail("Caught a FileNotFoundException");
		}
	}	

}
