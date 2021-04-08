package main;

public class Item {
	
	private int id;
	
	private String nombre;
	
	private Recipe[] recetas;
	
	public Item() {
		id = -1;
		
		nombre = "";
		
		recetas = new Recipe[4];
	}
	
	public Item(int id, String nombre, Recipe[] recetas) {
		this.id = id;
		this.nombre = nombre;
		this.recetas = recetas;
	}
	
	public Item(Item copy) {
		this.id = copy.id;
		this.nombre = copy.nombre;
		this.recetas = copy.recetas;
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

	public void setReceta(Recipe receta, int id) {
		this.recetas[id] = receta;
	}
	
	@Override
	public String toString() {
		String linesPerRecipe = "";
		for(int i = 0; i < recetas.length; i++) {
			if(recetas[i] != null) {
				linesPerRecipe += this.id + " " + this.nombre + " --> " + this.recetas[i].toString() + "\n";
			}
		}
		return linesPerRecipe;
	}
}
