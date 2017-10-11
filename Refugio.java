package mirefugio.poo;
import java.util.ArrayList;

public class Refugio {
	private String nombre;
	private ArrayList<Animal> disponibles;

	public Refugio(String nombre){
		this.nombre=nombre;
		disponibles = new ArrayList<Animal>();
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void refugiaNuevoAnimal(Animal animal){
		disponibles.add(animal);
	}
	public void revisaDisponibles(){
		for (Animal animal : disponibles){
			System.out.println(animal);
		}
	}
	public Mascota eligeMascota(){
		return null;
	}

}
