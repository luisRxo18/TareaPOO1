package mirefugio.poo;

public class DiaDeAdopciones {

	public static void main(String[] args) {
		/*Creando obejtos*/
		Persona luis = new Persona("Luis Diaz", 18);
		Persona vanessa = new Persona("Vanessa Solares", 19);
		
		Refugio ref1 = new Refugio("AaPET");
		
		Perro perro1 = new Perro("Dalmata");
		Gato gato1 = new Gato("Siames");
		Zorro zorro1 = new Zorro("Zorro Rojo");
		Perro perro2 = new Perro("Chihuahua");
		Gato gato2 = new Gato("Persa");
		Zorro zorro2 = new Zorro("Zorro Plateado");
		Perro perro3 = new Perro("Labrador");
		Perro perro4 = new Perro("French poodle");
		
		/*Configurando*/
		ref1.refugiaNuevoAnimal(perro1);
		ref1.refugiaNuevoAnimal(perro2);
		ref1.refugiaNuevoAnimal(perro3);
		ref1.refugiaNuevoAnimal(perro4);
		ref1.refugiaNuevoAnimal(gato1);
		ref1.refugiaNuevoAnimal(gato2);
		ref1.refugiaNuevoAnimal(zorro1);
		ref1.refugiaNuevoAnimal(zorro2);
		

		/*Comienza el proceso*/
		System.out.println("\nLuis visita el refugio\n\n");
		luis.visitaRefugio(ref1);
		
		
		luis.adopta();
		luis.muestraMascotas();
		
		luis.adopta();
		luis.muestraMascotas();
		
		System.out.println("\n\nAna visita el refugio\n\n");
		vanessa.visitaRefugio(ref1);
		vanessa.adopta();
		vanessa.muestraMascotas();
		
		System.out.println("\n\nEn el refugio quedan estos animales:\n");
		ref1.revisaDisponibles();
		
		System.out.println("\n\nImprimiendo todos los objetos animales\n");
		System.out.println(perro1);
		System.out.println(perro2);
		System.out.println(perro3);
		System.out.println(perro4);
		System.out.println(gato1);
		System.out.println(gato2);
		System.out.println(zorro1);
		System.out.println(zorro2);
		
	}

}
