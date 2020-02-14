/**
 * 
 */
package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import main.java.CountingValleys;

/**
 * @author MacAfgPaletta
 *
 */
class TestValleys {

	/**
	 * Test method for {@link CountingValleys#numValleys(int, java.lang.String)}.
	 * @throws IOException 
	 */
	@Test
	final void testNumValleys00() throws IOException {
		String path = System.getProperty("user.dir");
		
		File file =  new File(path+"\\src\\main\\test\\input00.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lines = br.readLine();
		
		List<String> hike = new ArrayList<>();
		while(lines!=null) {
			hike.add(lines);
			lines = br.readLine();
		}
		
		br.close();
		
		assertEquals(1,CountingValleys.numValleys(Integer.parseInt(hike.get(0)), hike.get(1)));
		
	}
	
	/**
	 * Test method for {@link CountingValleys#numValleys(int, java.lang.String)}.
	 * @throws IOException 
	 */
	@Test
	final void testNumValleys01() throws IOException {
		String path = System.getProperty("user.dir");
		
		File file =  new File(path+"\\src\\main\\test\\input01.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lines = br.readLine();
		
		List<String> hike = new ArrayList<>();
		while(lines!=null) {
			hike.add(lines);
			lines = br.readLine();
		}
		
		br.close();
		
		assertEquals(2,CountingValleys.numValleys(Integer.parseInt(hike.get(0)), hike.get(1)));
		
	}
	
	@Test
	final void testNumValleys_Error00() throws IOException {
		String path = System.getProperty("user.dir");
		
		File file =  new File(path+"\\src\\main\\test\\input00.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lines = br.readLine();
		
		List<String> hike = new ArrayList<>();
		while(lines!=null) {
			hike.add(lines);
			lines = br.readLine();
		}
		
		br.close();
		
		assertNotEquals(2,CountingValleys.numValleys(Integer.parseInt(hike.get(0)), hike.get(1)));
		
	}
	
	@Test
	final void testNumValleys_Error01() throws IOException {
		String path = System.getProperty("user.dir");
		
		File file =  new File(path+"\\src\\main\\test\\input01.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lines = br.readLine();
		
		List<String> hike = new ArrayList<>();
		while(lines!=null) {
			hike.add(lines);
			lines = br.readLine();
		}
		
		br.close();
		
		assertNotEquals(1,CountingValleys.numValleys(Integer.parseInt(hike.get(0)), hike.get(1)));
		
	}

}
