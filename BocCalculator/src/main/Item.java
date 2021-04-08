package main;

import java.util.Arrays;

public class Item {
	
	private int id;
	
	private String nombre;
	
	private String[] receta;
	
	public Item() {
		id = -1;
		
		nombre = "";
		
		receta = new String[8];
	}
	
	public Item(int id, String nombre, String[] receta) {
		this.id = id;
		this.nombre = nombre;
		this.receta = Arrays.copyOf(receta, 8);
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

	public String[] getReceta() {
		return receta;
	}

	public void setReceta(String[] receta) {
		this.receta = receta;
	}
	
	
}
