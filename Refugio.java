package mirefugio.poo;
import java.util.ArrayList;
import java.util.Scanner;


public class Refugio {
    Scanner scan = new Scanner(System.in);
    int elec;
	private String nombre;
	private ArrayList<Animal> disponibles;

	public Refugio(String nombre){
        setNombre(nombre);
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
        for(Animal an : disponibles){
            System.out.println("Quieres Adoptar a la mascota: "+ an + " ? Si=1 / No=2 ");
            elec = scan.nextInt();
            if(elec==1){
                disponibles.pop(an);
                return an;
            }
            else{
                System.out.println("No adoptaste nada");
                return null;
            }
            
            
        }
		return null;
	}

}
