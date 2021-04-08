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
	
	@Override
	public String toString() {
		return "{" + components[0] + ", " + components[1] + ", " + components[2] + ", " + components[3] + ", "
				+ components[4] + ", " + components[5] + ", " + components[6] + ", " + components[7] + "}";
	}
	
}
