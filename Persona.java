package mirefugio.poo;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Mascota> mascotas;
	private Refugio enRefugio;

	public Persona(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
		mascotas = new ArrayList<Mascota>();
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad (int edad){
		this.edad=edad;

	}
	public void visitaRefugio(Refugio refugio){
		enRefugio = refugio;
	}
	public void adopta(){
		Mascota nuevaMascota = this.enRefugio.eligeMascota();
		if(nuevaMascota!=null){
			Scanner input = new Scanner(System.in);
			System.out.print("Cual sera su nombre?");
			String nom = input.nextLine();
			nuevaMascota.setNombre(nom);
			this.mascotas.add(nuevaMascota);
			nuevaMascota.adoptado(this);
		}
	}
	public void muestraMascotas(){
        	for(Mascota mas : mascotas){
            		System.out.println(mas);
       		 }
	}
}
