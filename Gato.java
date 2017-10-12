package mirefugio.poo;

public class Gato implements Mascota, Animal{

	private String raza;
	private String nombre;
	private Persona duenio;

	public Gato(String raza){
		this.raza=raza;
		this.nombre="Sin nombre";
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
		return duenio;
	}
	public void adoptado(Persona adoptante){
		duenio = adoptante;
	}
	public String hablar(){
		return "Miau! ";
	}
	public String getRaza(){
		return raza;
	}
	public String toString(){
		String d;
		if (this.duenio == null)
			d = "Sin duenio";
		else
			d = this.duenio.getNombre();
		return ""+this.raza+", " + this.nombre+", de "+d+"";
	}

}
