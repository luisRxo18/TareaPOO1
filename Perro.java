package mirefugio.poo;

public class Perro implements Mascota, Animal{
	private String raza;
	private String nombre;
	private Persona duenio;

	public Perro(String raza){
		this.raza=raza;
		duenio = new Persona();
	}
	public void setRaza(String raza){
		this.raza = raza;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public Persona getDuenio(){
		return duenio;
	}
	public void adoptado (Persona adoptante){
		duenio=adoptante;
	}
	public String hablar(){
		return "Guau Guau Guau Guau";
	}
	public String getRaza(){
		return raza;
	}
}
