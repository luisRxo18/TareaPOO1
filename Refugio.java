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
            System.out.println("animal : " + animal.getRaza());
        }
	}
	public Mascota eligeMascota(){
        for(Animal an : disponibles){
            System.out.println("Quieres Adoptar a la mascota: "+ an.getRaza() + " ? Si=1 / No=2 ");
            elec = scan.nextInt();
            scan.nextLine();
            if(elec==1){
                try{
                String nam;
                System.out.println("Que nombre le vas a poner?");
                nam = scan.nextLine();
                
                
                int b = disponibles.indexOf(an);
                
                disponibles.remove(b);
                
                Mascota ma = (Mascota)an;
                ma.setNombre(nam);
                
                return ma;
                }
                catch(Exception error){
                    System.out.println("No puedes adoptar un zorro es ilegal");
                    System.exit (0);
                }
            }
            else{
                System.out.println("No adoptaste nada");
                
            }
            
            
        }
		return null;
	}

}
