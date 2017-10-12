package mirefugio.poo;

public class DiaDeAdopciones {

	public static void main(String[] args) {
		/*Creando obejtos*/
		Persona juan = new Persona("Juan Perez", 18);
		Persona ana = new Persona("Ana Lopez", 20);
		
		Refugio ref1 = new Refugio("Adopt a PET");
		
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
		System.out.println("\nJuan visita el refugio\n\n");
		juan.visitaRefugio(ref1);
		
		
		juan.adopta();
		juan.muestraMascotas();
		
		juan.adopta();
		juan.muestraMascotas();
		
		System.out.println("\n\nAna visita el refugio\n\n");
		ana.visitaRefugio(ref1);
		ana.adopta();
		ana.muestraMascotas();
		
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
