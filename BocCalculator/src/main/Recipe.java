package main;

public class Recipe {
	private String[] components;

	public Recipe() {
		components = new String[8];
	}
	
	public Recipe(String[] components) {
		this.components = components;
	}
	
	public String[] getComponents() {
		return components;
	}

	public void setComponents(String[] components) {
		this.components = components;
	}
	
	
}
