package mirefugio.poo;
import java.util.ArrayList;

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
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public void setEdad (int edad){
		this.edad=edad;

	}
	public void visitaRefugio(Refugio refugio){
		enRefugio=refugio;
	}
	public void adopta(){
        
        mascotas.add(enRefugio.eligeMascota());
            

	}
	public void muestraMascotas(){
        for(Mascota mas : mascotas){
            System.out.println("Tienes de mascota a "+ mas.getNombre());
        }
	}
}
