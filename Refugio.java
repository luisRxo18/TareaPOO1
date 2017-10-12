package mirefugio.poo;
import java.util.ArrayList;
import java.util.Scanner;


public class Refugio {
	private String nombre;
    private ArrayList<Animal> disponibles;
    private ArrayList<String> disp;

	public Refugio(String nombre){
        setNombre(nombre);
        disponibles = new ArrayList<Animal>();
        disp = new ArrayList<String>();
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
        for (Animal animal : this.disponibles){
            System.out.println("" + animal.hablar() + "(" + animal.getRaza() + ")");
            this.disp.add(animal.getRaza());
        }
	}
	public Mascota eligeMascota(){
        revisaDisponibles();
        Scanner input = new Scanner(System.in);
        System.out.println("Elige la raza de tu mascota!");
        String eleccion = input.nextLine();
        if(disp.contains(eleccion)){
            Animal buenaEleccion = null;
            for(Animal dis: this.disponibles)
                if(dis.getRaza().equals(eleccion)){
                    buenaEleccion = dis;
                    break;
                }
            if(buenaEleccion!=null){    
                try {
                    Mascota nuevaMascota = (Mascota)buenaEleccion;
                    this.disponibles.remove(buenaEleccion);
                    return nuevaMascota;
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println("Esa no es una mascota");
                    return null;
                }
            }
        }
        else{
            Mascota nada = null;
            System.out.println("Estas loco? esa raza no esta en la lista");
            return nada;
        }
    return null;
    }
}