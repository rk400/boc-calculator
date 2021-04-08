package main;

public class Item {
	
	private int id;
	
	private String nombre;
	
	private Recipe[] recetas;
	
	public Item() {
		id = -1;
		
		nombre = "";
		
		recetas = new Recipe[8];
	}
	
	public Item(int id, String nombre, Recipe[] recetas) {
		this.id = id;
		this.nombre = nombre;
		this.recetas = recetas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Recipe[] getReceta() {
		return recetas;
	}

	public void setReceta(Recipe[] recetas) {
		this.recetas = recetas;
	}
	
	
}
