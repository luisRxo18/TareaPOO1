package mirefugio.poo;

public class Gato implements Mascota, Animal{

	private String raza;
	private String nombre;
	private Persona duenio;

	public Gato(String raza){
		this.raza=raza;
	}

	public void setRaza(String raza){
		this.raza = raza;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public Persona getDuenio(){
		return null;
	}
	public void adoptado (Persona adoptante){

	}
	public String hablar(){
		return "voy a conquistar el mundo";
	}
	public String getRaza(){
		return raza;
	}

}
