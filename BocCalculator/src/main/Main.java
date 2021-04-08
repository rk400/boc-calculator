package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	
	private static String route = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + 
						"items.txt";
	
	private static String[] componentNames = new String[26];
	
	public static void main(String[] args) {
		File f = new File(route);
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			System.out.println("Error loading the file \"items.txt\", close the program an restart to use it");
		}
		
		
	}
}
