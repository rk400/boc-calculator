package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	private static String route = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + 
						"items.txt";
	
	private static String[] componentNames = new String[26];
	
	private static ArrayList<Item> items;
	
	public static void main(String[] args) {
		File f = new File(route);
		items = new ArrayList<Item>();
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(f));
			for(int i = 0; i < 26; i++) {
				String line = buffer.readLine();
				
				componentNames[i] = line;
			}
			String line = "";
			Item temp = new Item();
			int contRecetas = 0;
			while((line = buffer.readLine()) != null) {
				if(line.startsWith(" |-")) {
					items.add(new Item(temp));
					
					continue;
				}
				if(line.startsWith(" | {{|")) {
					line = line.replace(" | {{|", "");
					line = line.replaceAll("}}", "");
					String[] elements = line.split("\\|");
					int[] idComponentes = new int[elements.length];
					for(int i = 0; i < elements.length; i++)
						idComponentes[i] = Integer.parseInt(elements[i]);
					temp.setReceta(new Recipe(idComponentes), contRecetas);
					contRecetas++;
					continue;
				}
				if(line.startsWith(" | {{")) {
					line = line.replace(" | {{", "");
					line = line.replaceAll("}}", "");
					temp.setNombre(line);
					contRecetas = 0;
					continue;
				}
				if(line.startsWith(" | ")) {
					line = line.replace(" | ", "");
					temp.setId(Integer.parseInt(line));
				}
			}
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i).toString());
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error loading the file \"items.txt\", close the program an restart to use it");
		} catch (IOException ie) {
			System.out.println("An error happened while loading the items and the recipes. Error 01; IOException");
		} 
		
		
	}
	
	
}
