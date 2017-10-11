package mirefugio.poo;
import java.util.ArrayList;

public class Refugio {
	private String nombre;
	private ArrayList<Animal> disponibles;

	public Refugio(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void refugiaNuevoAnimal(Animal animal){

	}
	public void revisaDisponibles(){

	}
	public Mascota eligeMascota(){
		return null;
	}

}
