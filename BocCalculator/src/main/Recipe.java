package main;

public class Recipe {
	private int[] components;

	public Recipe() {
		components = new int[8];
	}
	
	public Recipe(int[] components) {
		this.components = components;
	}
	
	public int[] getComponents() {
		return components;
	}

	public void setComponents(int[] components) {
		this.components = components;
	}
	
	
}
